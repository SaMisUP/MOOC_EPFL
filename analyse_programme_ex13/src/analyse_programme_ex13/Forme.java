package analyse_programme_ex13;

class Forme {
private String couleur;
public Forme(String uneCouleur) {
couleur = uneCouleur;
}
public Forme clone() {
return new Forme(this);
}
public Forme(Forme other) {
this.couleur = other.couleur;
}
public void dessine(){
System.out.println("Une forme " + couleur);
}
}
