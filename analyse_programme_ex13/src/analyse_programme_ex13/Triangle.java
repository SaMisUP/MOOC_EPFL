package analyse_programme_ex13;

class Triangle extends Forme {
public Triangle(String uneCouleur){
super(uneCouleur);
}
public Triangle(Triangle autreTriangle){
super(autreTriangle);
}
public Triangle clone(){
return new Triangle(this);
}
public void dessine(){
super.dessine();
System.out.println("toute pointue");
}
}
