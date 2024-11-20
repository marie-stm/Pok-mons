package TP5;

import java.util.ArrayList;

public class GroupePokémon {
	
 ArrayList<E> <Pokemon> pokemons=new ArrayList<>();
 public void ajouter (Pokemon p) {
	 pokemons.add(p);
	 
 }
 public double vitesseMoyenne() {
	 double somme=0;
	 for(Pokemon pok:pokemons)
		 somme=somme+pok.vitesse();
	 
	 return somme/pokemons.size();
	 
 }
 public void afficher() {
	 for(Pokemon pok:pokemons)
		 System.out.println(pok.Nom);
 }
 public boolean rechecher (String nom) {
	 return pokemons.contains(nom);
 }
}
