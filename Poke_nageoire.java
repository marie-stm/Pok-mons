package TP5;

public abstract class Poke_nageoire extends Pokemon{
private int nbNageoire;

public Poke_nageoire(String nom, String poids, int nbNageoire) {
	super(nom, poids);
	this.nbNageoire= nbNageoire;
	// TODO Auto-generated constructor stub
}
public double vitesse(){
    return super.poids / 25 * this.nbNageoire;
@Override
public String toString() {
	return super.toString() + "/nPoke_nageoire [nbNageoire=" + nbNageoire + "]";
}}

