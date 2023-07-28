package analyse_programme_ex13;

class Cercle extends Forme{
public Cercle(String uneCouleur){
super(uneCouleur);
}
public Cercle(Cercle autreCercle){
super(autreCercle);
}
public Cercle clone(){
return new Cercle(this);
}
public void dessine(){
super.dessine();
System.out.println("toute ronde");
}
}
