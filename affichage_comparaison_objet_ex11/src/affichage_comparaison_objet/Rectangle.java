package affichage_comparaison_objet;

class Rectangle
{
private double largeur;
private double hauteur;
public Rectangle(double uneLargeur, double uneHauteur)
{
largeur = uneLargeur;
hauteur = uneHauteur;
}
public boolean equals(Object autreRect)
{
// permet de passer correctement la ligne commentée .3 du test 3:
if (autreRect == null)
return false;
else
// garantit que l'on compare bien des
// objet de même classe
if (autreRect.getClass() != getClass()){
return false;
}
else
{
// procède à la comparaison attribut par
// attribut
return (
// Ne pas oublier le transtypage ici
(largeur == ((Rectangle)autreRect).largeur)
&&
hauteur == ((Rectangle)autreRect).hauteur);
}
}
public String toString()
{
return "Rectangle : \n "
+ "largeur = " + largeur + "\n hauteur = " + hauteur;
}
}