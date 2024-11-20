package TP5;

public class Croisière extends Poke_nageoire{

public Croisière(String nom, String poids, int nbNageoire) {
	super(nom, poids, nbNageoire);
	// TODO Auto-generated constructor stub
}
 public double vitesse() {
  return super.vitesse()/2;
 }}