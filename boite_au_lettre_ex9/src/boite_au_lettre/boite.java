package boite_au_lettre;

class boite {
private courrier[] contenu;
private static int count = 0;
private int index;
// constructeur
public boite(int max) {
contenu = new courrier[max];
index = 0;
}
// la méthode demand'ee
public double affranchir() {
double montant = 0.0;
for(int i=0; i < index; ++i){
courrier c = contenu[i];
montant += c.affranchir();
}
return montant;
}
public int size() {
return index;
}
public courrier getCourrier(int index) {
if (index < contenu.length)
return contenu[index];
else
return null;
}
// autre m'ethode demandée dans l'interface
// d'utilisation de la classe
public int courriersInvalides() {

for (int i = 0; i < index; i++) {
if (!contenu[i].valide())
count++;
}
return count;
}
// difficile de fonctionner sans
public void ajouterCourrier(courrier unCourrier) {
if (index < contenu.length){
contenu[index] = unCourrier;
index++;
} else {
System.out.println("Impossible d'ajouter un nouveau courrier. Boite pleine !");
}
}
public void afficher() {
for (int i = 0; i < index; i++) {
System.out.println(contenu[i]);
}
}
}

