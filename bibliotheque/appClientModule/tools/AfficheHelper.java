package tools;
import java.util.List;

public class AfficheHelper {
	//construction d'un singleton
	private static AfficheHelper objetUnique = null;
	
	//désactiver constructeur
	private AfficheHelper() {
		
	}
	
	//garantir la création d'un seul et même objet
	public static AfficheHelper getInstance(){
		if(objetUnique == null){
			objetUnique = new AfficheHelper();
		}
		return objetUnique;
	}
	
	//methode de recherche d'un livre
	public List rechercherUneListe(List liste){
		
		System.out.println("helper listing : "+liste);
		//System.out.println("ListPOOOe");
		return liste;
		
	}
	
}
