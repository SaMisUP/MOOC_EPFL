package boite_au_lettre;

class publicite extends courrier {
public publicite(double poids, boolean express, String adresse){
super(poids, express, adresse);
}
// redéfinit affranchirNormal()
public double affranchirNormal() {
return getPoids()/1000.0 * 5.0;
}
// inutile de red'efinir la méthode valide() pour les publicités
@Override
public String toString() {
String s = "Publicité\n";
s += super.toString();
return s;
}
}
