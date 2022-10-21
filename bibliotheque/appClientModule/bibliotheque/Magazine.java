package bibliotheque;
import java.sql.Timestamp;

public class Magazine extends Ouvrage{
	
	public Timestamp datePublication;
	
	//Constructor
	public Magazine(String titre,int nbExemp,String editeur,  String genre, String support, String statut) {
		this.setTitre(titre);
		this.setEditeur(editeur);
		this.setNbExemplaire(nbExemp);
		this.setGenre(genre);
		this.setSupport(support);
		this.setStatut(statut);
		this.className = "Magazine";
	}
	@Override
	public String toString() {
		//super.toString();
		return this.getTitre()+"  "+ this.getEditeur() +" x"+ this.getNbExemplaire()+"("+this.getStatut()+")";
	}
}
