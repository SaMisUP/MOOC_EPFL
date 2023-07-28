package boite_au_lettre;

class lettre extends courrier {
	//attributs sp'ecifiques aux lettres:
	private String format = "";
	public lettre(double poids, boolean express, String adresse, String format){
	super(poids, express, adresse);
	this.format = format;
	}
	// red'efinit affranchirNormal()
	public double affranchirNormal() {
	double montant = 0;
	if (format.equals("A4")){
	montant = 2.0;
	} else {
	montant = 3.5;
	}
	montant += getPoids()/1000.0;
	return montant;
	}
	// inutile de red'efinir la méthode valide() pour les lettres
	@Override
	public String toString() {
	String s = "Lettre\n";
	s += super.toString();
	s += " Format : " + format + "\n";
	return s;
	}
	}
