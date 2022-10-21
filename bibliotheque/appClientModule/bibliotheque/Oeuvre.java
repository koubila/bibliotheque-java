package bibliotheque;

public abstract class Oeuvre {
	private String titre;
	private String genre;
	private String support;
	private String statut;
	private int nbExemplaire;
	protected String className;
	
	
	public String getTitre() {
		return titre;
	}
	protected void setTitre(String titre) {
		this.titre = titre;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getSupport() {
		return support;
	}
	public void setSupport(String support) {
		this.support = support;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public int getNbExemplaire() {
		return nbExemplaire;
	}
	public void setNbExemplaire(int nbExemplaire) {
		this.nbExemplaire = nbExemplaire;
	}


}
