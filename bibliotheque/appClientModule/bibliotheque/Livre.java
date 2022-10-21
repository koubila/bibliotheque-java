package bibliotheque;

public class Livre extends Ouvrage{
	
	
	private String nomAuteur;
	
	//Constructor
	public Livre(String titre,String nomAuteur,int nbExemp,String editeur,  String genre, String support, String statut) {
		this.setTitre(titre);
		this.setNomAuteur(nomAuteur);
		this.setNbExemplaire(nbExemp);
		this.setGenre(genre);
		this.setEditeur(editeur);
		this.setSupport(support);
		this.setStatut(statut);
		this.className = "Livre";
	}
	
	public String getNomAuteur() {
		return nomAuteur;
	}

	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}
	
	@Override
	public String toString() {
		//super.toString();
		return this.getTitre()+" de "+ this.getNomAuteur() +" x"+ this.getNbExemplaire()+"("+this.getStatut()+")";
	}
	

	

}