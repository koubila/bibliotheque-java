package bibliotheque;

import java.util.List;

public interface ContratInterface {
	
	//helper => public List<Livre> rechercherLivre(String intitule);
	//helper => public String afficherLivre(Livre livre);
	
	//constructeur => public Livre creerLivre(String auteur,String titre,int emplacement,int etagere,String rangee);
	public boolean existeLivre(String intitule);
	public Emplacement rangerUneOeuvre(Oeuvre oe, List<Emplacement> emp);
	public void rangerToutesLesOeuvres(List<Oeuvre> oeuvvre, List<Emplacement> emplacement);
	public void emprunterOeuvre(Oeuvre oeuvre,List<Emplacement>emplacements);
	public void rendreOeuvre(Oeuvre oeuvre);
	
	//constructeur => public String recupererEmplacementLivre(Livre livre);
	
}