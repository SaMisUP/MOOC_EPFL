package analyse_programme_ex13;

class Polymorph{
public static void main(String[] args){
Forme[] tabFormes = {new Cercle("rouge"),
new Triangle("jaune")
};
Collect formes = new Collect(10);
// Une collection de formes
// contenant une copie des objets definis
// dans le tableau tabFormes
for (int i = 0; i < tabFormes.length; ++i)
formes.add(tabFormes[i].clone());
formes.dessine();
}
}
