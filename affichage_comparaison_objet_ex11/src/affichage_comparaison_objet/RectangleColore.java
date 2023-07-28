package affichage_comparaison_objet;

class RectangleColore extends Rectangle
{
private String couleur;
public RectangleColore(double uneLargeur, double uneHauteur, String uneCouleur)
{
super(uneLargeur, uneHauteur);
couleur = uneCouleur;
}
public boolean equals(Object autreRectColore)
{
if (autreRectColore == null){
return false;
}
else if (autreRectColore.getClass() != getClass())
{
return false;
}
else
{
// Réutilisation du equals de la super-classe
// pour éviter toute duplication de code
return (super.equals(autreRectColore) &&
couleur.equals(((RectangleColore)autreRectColore).couleur)
);
}
}
public String toString()
{
// Réutilisation de toString de la super-classe
// pour éviter toute duplication de code
return (super.toString() + "\n couleur = " + couleur);
}
}