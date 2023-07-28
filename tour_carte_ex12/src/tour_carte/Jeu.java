package tour_carte;

class Jeu {
private int nombreCartes;
private Carte[] cartes;
public Jeu(int nb) {
nombreCartes = nb;
cartes = new Carte[nb];
System.out.println("On change de main");
}
/**
* Joue une carte après l'autre
*/
public void joue() {
System.out.println("Je joue une carte...");
int i = 0;
while ((cartes[i] == null) && i < nombreCartes) {
i++;
}
if ((i < nombreCartes) && (cartes[i] != null)) {
System.out.println("La carte jouée est :");
cartes[i].afficher();
cartes[i] = null;
} else {
System.out.println("Plus de cartes");
}
}
/**
* Ajoute une carte à la collection
*/
public void piocher(Carte carte) {
int i = 0;
while ((i < nombreCartes) && (cartes[i] != null)) {
i++;
}
if (i < nombreCartes) {
cartes[i] = carte;
} else {
System.out.println("Nombre maximal de cartes atteint");
}
}
public void afficher() {
for (int i = 0; i < nombreCartes; ++i) {
if (cartes[i] != null) {
cartes[i].afficher();
}
}
}
}
