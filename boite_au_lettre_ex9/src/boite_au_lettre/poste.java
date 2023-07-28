package boite_au_lettre;

class poste {
public static void main(String args[]) {
//Cr'eation d'une boite-aux-lettres
boite boite = new boite(30);
//Creation de divers courriers/colis..
lettre lettre1 = new lettre(200, true, "Chemin des Acacias 28, 1009 Pully", "A3");
lettre lettre2 = new lettre(800, false,"", "A4"); // invalide
publicite pub1 = new publicite(1500, true, "Les Moilles 13A, 1913 Saillon");
publicite pub2 = new publicite(3000, false, ""); // invalide
colis colis1 = new colis(5, true, "Grand rue 18, 1950 Sion", 3);
//colis colis2 = new colis(3000, true, "Chemin des fleurs 48, 2800 Delemont", 70); //Colis invalide !
boite.ajouterCourrier(lettre1);
boite.ajouterCourrier(lettre2);
boite.ajouterCourrier(pub1);
boite.ajouterCourrier(pub2);
boite.ajouterCourrier(colis1);
//boite.ajouterCourrier(colis2);
System.out.println("Le montant total d'affranchissement est de " +
boite.affranchir());
boite.afficher();
System.out.println("La boite contient " + boite.courriersInvalides()
+ " courriers invalides");
}
}
