package tour_carte;

class Terrain extends Carte {
private Couleur couleur;
public Terrain(char c) {
couleur = new Couleur(c);
System.out.println("Un nouveau terrain.");
}
public void afficher() {
System.out.print("Un terrain ");
couleur.afficher();
System.out.println();
}
}
