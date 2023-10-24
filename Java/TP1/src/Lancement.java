package SHIFUMIV1SansEnum;

public class Lancement {

    public static void main(String[] args) {

	Partie p = new Partie(new Humain("Coco"), new Machine(), 3);
	p.go();
    }
}
