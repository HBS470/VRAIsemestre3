package enonce;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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
        return notes.stream().filter(m -> m.getModule().getNiveau() == Niveau.S1).allMatch(g -> g.getVal() >10);
    }

    public Niveau lesNiveauxIncomplets(){
        
    }

}
