package tour_carte;

class Couleur {
private char valeur;
public Couleur(char c) {
valeur = c;
}
public void afficher() {
this.afficher(false);
}
public void afficher(boolean feminin) {
switch (valeur) {
case 'r':
System.out.println("rouge");
break;
case 'v':
System.out.print("vert");
if (feminin) {
System.out.println("e");
}
break;
case 'b':
System.out.print("bleu");
if (feminin) {
System.out.println("e");
}
break;
case 'B':
System.out.print("blanc");
if (feminin) {
System.out.println("he");
}
break;
case 'n':
System.out.print("noir");
if (feminin) {
System.out.println("e");
}
break;
}
}
}
