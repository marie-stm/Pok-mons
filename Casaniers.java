package TP5;

public class Casaniers extends Poke_patte {
 private int nbHeures;




public Casaniers(String nom, String poids, String taille, int nbPattes, int nbHeures) {
	super(nom, poids, taille, nbPattes);
	// TODO Auto-generated constructor stub
	this.nbHeures= nbHeures;
}

@Override
public String toString() {
	return super.toString()+ "/nCasaniers [nbHeures=" + nbHeures + "]";
}
}
