package enonce;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Module m11 = new Module("M11", Niveau.S1);
        Module m12 = new Module("M12", Niveau.S1);
        Module m21 = new Module("M21", Niveau.S2);
        Module m22 = new Module("M22", Niveau.S2);
        Module m31 = new Module("M31",Niveau.S3);
        Etudiant e1 = new Etudiant("toto", Arrays.asList(new Note(m11, 10),
        new Note(m12, 8), new Note(m21, 5), new Note(m22, 5), new Note(m31,15)));

        // 1
        System.out.println(e1.note(m21));
        // 2
        System.out.println(e1.auMoinsUneNoteSous7());
        // 3
        System.out.println(e1.aLaMoyennePartout());
        // 4
        System.out.println(e1.aLaMoyenneauxModulesS1());
        // 5
        //System.out.println(e1.lesNiveauxIncomplets());
        // 6
        System.out.println(e1.unNomDeModuleDeS2Rate());
        // 7
        System.out.println(e1.moyenneReduce());
        System.out.println(e1.moyenneAveringInt());
        // 8
        System.out.println(e1.moyenne(Niveau.S1));
        // 9
        System.out.println(e1.lesModulesObtenues());
        // 10
        System.out.println(e1.meilleurNote());
        System.out.println(e1.meilleurNoteMaxBy());
        // 11
        System.out.println(e1.lesNotesParNiveau());
    }
    
}
