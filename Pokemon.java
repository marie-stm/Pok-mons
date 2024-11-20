package TP5;

public abstract class Pokemon {
	
		protected String nom;
		protected String poids;
		
		public abstract double vitesse();

		public Pokemon(String nom, String poids) {
			this.nom = nom;
			this.poids = poids;
		}

		@Override
		public String toString() {
			return "Pokemon [nom=" + nom + ", poids=" + poids + "]";
		}
}

	

