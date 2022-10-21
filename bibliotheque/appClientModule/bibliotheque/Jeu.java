package bibliotheque;

public class Jeu extends Media{
	private String ageLimite;
	
	//Constructor
		public Jeu(String titre,int nbExemp,String ageLimite,  String genre, String support, String statut) {
			this.setTitre(titre);
			this.setAgeLimite(ageLimite);
			this.setNbExemplaire(nbExemp);
			this.setGenre(genre);
			this.setSupport(support);
			this.setStatut(statut);
			this.className = "Jeu";
		}

		public String getAgeLimite() {
			return ageLimite;
		}

		public void setAgeLimite(String ageLimite) {
			this.ageLimite = ageLimite;
		}
		@Override
		public String toString() {
			//super.toString();
			return this.getTitre()+" limite d'age "+ this.getAgeLimite()+"("+this.getStatut()+")";
		}


}
