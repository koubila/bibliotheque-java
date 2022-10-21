package bibliotheque;

public class Film extends Media{
	
	private String nomActeur;
	
	//Constructor
	public Film(){
	}
	public Film(String titre,int nbExemp,String nomActeur,  String genre, String support, String statut) {
		this.setTitre(titre);
		this.setNomActeur(nomActeur);
		this.setNbExemplaire(nbExemp);
		this.setGenre(genre);
		this.setSupport(support);
		this.setStatut(statut);
		this.className = "Film";
	}
	
	public String getNomActeur() {
		return nomActeur;
	}

	public void setNomActeur(String nomActeur) {
		this.nomActeur = nomActeur;
	}
	@Override
	public String toString() {
		//super.toString();
		return this.getTitre()+" avec "+ this.getNomActeur()+"("+this.getStatut()+")";
	}

}
