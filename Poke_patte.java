package TP5;

public abstract class Poke_patte extends Pokemon {
	protected String taille;
	protected int nbPattes;
	public Poke_patte(String nom, String poids, String taille, int nbPattes) {
		super(nom, poids);
		this.taille= taille;
		this.nbPattes= nbPattes;
		// TODO Auto-generated constructor stub
	}

public double vitesse() {
	return this.nbPattes * this.poids * 3;
}

@Override
public String toString() {
	return "Poke_patte [taille=" + taille + ", nbPattes=" + nbPattes + "]";
}}

