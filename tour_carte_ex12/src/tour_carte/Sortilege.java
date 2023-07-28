package tour_carte;

class Sortilege extends Carte {
private String nom;
private String description;
public Sortilege(int cout, String nom, String desc) {
super(cout);
this.nom = nom;
this.description = desc;
System.out.println("Un sortilège de plus.");
}
public void afficher() {
System.out.println("Un sortilège " + nom + " ");
}
}
