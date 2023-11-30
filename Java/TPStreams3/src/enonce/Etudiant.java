package enonce;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Etudiant {
    public static int compteur = 0;
    private int numeroEtudiant;
    private String nom;
    private List<Note> notes;

    public Etudiant(String nom, List<Note> notes) {
	this.nom = nom;
	this.notes = notes;
	this.numeroEtudiant = compteur;
	compteur++;
    }

    public String getNom() {
	return nom;
    }

    public List<Note> getNotes(){
        return notes;
    }

    @Override
    public String toString() {
	return "Etudiant [nom=" + nom + ", notes=" + notes + "]";
    }

    public int getNumeroEtudiant() {
	return numeroEtudiant;
    }

    public int note(Module m){
        Optional<Integer> nn = notes.stream().filter(n -> n.getModule() == m).map(v -> v.getVal()).collect(Collectors.toList()).stream().findAny();
        return nn.orElse(-1);
    }

    public boolean auMoinsUneNoteSous7(){
        return notes.stream().anyMatch(n -> n.getVal()<7);
    }

    public boolean aLaMoyennePartout() {
        return notes.stream().allMatch(g -> g.getVal() >= 10);
    }

    public boolean aLaMoyenneauxModulesS1() {
        return notes.stream().filter(m -> m.getModule().getNiveau() == Niveau.S1).allMatch(g -> g.getVal() >= 10);
    }

    public List<Niveau> lesNiveauxIncomplets(){
        List<Niveau> ln = notes.stream().filter(m -> m.getVal() < 8).map(g -> g.getModule().getNiveau()).collect(Collectors.toList());
        Iterator <Niveau> i = ln.iterator(); 
        for (Niveau n : ln){
            if (n.equals(i.next())) {
                ln.remove(n);
            }
        }
        return ln;
    }

    public String unNomDeModuleDeS2Rate(){
        return notes.stream().filter(m -> m.getVal() < 10).map(g -> g.getModule().getNom()).findAny().get();
    }

    public double moyenneReduce(){
        double somme = notes.stream().map(g -> g.getVal()).reduce(0,(x,y)->x+y);
        long total = notes.stream().map(g -> g.getVal()).reduce(0,(x,y)->x+1);

        return somme/total;
    }

    public double moyenneAveringInt(){
        return notes.stream().map(m -> m.getVal()).collect(Collectors.averagingInt(note -> note.intValue()));
    }

    public double moyenne(Niveau niv){
        double somme = notes.stream().filter(m -> m.getModule().getNiveau() == niv).map(g -> g.getVal()).reduce(0,(x,y)->x+y);
        long total = notes.stream().filter(m -> m.getModule().getNiveau() == niv).map(g -> g.getVal()).count();

        return somme/total;
    }

    public List<String> lesModulesObtenues(){
        return notes.stream().filter(m -> m.getVal() >= 10).map(g -> g.getModule().getNom()).collect(Collectors.toList());
    }

    public double meilleurNote() {
        return notes.stream().reduce((note1, note2) -> note1.getVal() > note2.getVal() ? note1 : note2).get().getVal();
    }

    public double meilleurNoteMaxBy(){
        return notes.stream().collect(Collectors.maxBy(Comparator.comparingInt(n -> n.getVal()))).get().getVal();
    }

    public Map<Niveau,List<Note>> lesNotesParNiveau(){
        return notes.stream().collect(Collectors.groupingBy(e->e.getModule().getNiveau()));
    }

}
