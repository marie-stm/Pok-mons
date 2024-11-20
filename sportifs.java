package TP5;

public class sportifs extends Poke_patte {
	public String frequence;

	public sportifs(String nom, String poids, String taille, int nbPattes, String frequence) {
		super(nom, poids, taille, nbPattes);
		// TODO Auto-generated constructor stub
		this.frequence= frequence;
	}

	@Override
	public String toString() {
		return super.toString() +"/nsportifs [frequence=" + frequence + "]";
	}

	
}
