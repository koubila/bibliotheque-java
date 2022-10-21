package bibliotheque;

import java.util.List;

public class Contrat implements ContratInterface {
	
	/**fonction qui range une oeuvre dans le premier emplacement libre
	 *@param Oeuvre oe, List<Emplacement>
	 * 
	 */
	@Override
	public Emplacement rangerUneOeuvre(Oeuvre oe, List<Emplacement> emp) {
		Emplacement oeuvreRangee = null;
		
		//parcourir les emplacements
		for (Emplacement e : emp) {
			//verifier si emplacement n'ai pas d'oeuvre
			if(e.getOeuvre() == null) {
				e.setOeuvre(oe);
				oe.setStatut("disponible");
				oeuvreRangee = e;
				String className = oe.className;
				System.out.println("L'Oeuvre : "+ className +" "+ oe.getTitre() + ", a été placée à la "+oeuvreRangee );
				return oeuvreRangee;
			}
		}
		return oeuvreRangee;
	}
	
	
	/**Ranger toutes les oeuvres 
	 *chaque oeuvre a son emlacement
	 *@param List<Oeuvre>,List<Emplacement>
	 */
	public void rangerToutesLesOeuvres(List<Oeuvre> oeuvres, List<Emplacement> emplacements) {
		
		//parcours de toutes les oeuvres pour les ranger un par un
		for (Oeuvre oe : oeuvres) {
			//rangement d'une oeuvre à sa place
			 rangerUneOeuvre(oe, emplacements);
		}
		 
	}


	/**Emprunter une oeuvre
	 * @param Oeuvre oeuvre, List<Emplacement>emplacements
	 */
	@Override
	public void emprunterOeuvre(Oeuvre oeuvre,List<Emplacement>emplacements) {
		//parcourir emplacement et vérifier si existe une oeuvre correspondante
		for (Emplacement emp : emplacements) {
			if(emp.getOeuvre() == oeuvre ) {
				System.out.println(" ");
				System.out.println("Avant emprunt :"+ emp + " "+ emp.getOeuvre());
				emp.setOeuvre(null);
				System.out.println("Apres emprunt :"+ emp+ " "+ emp.getOeuvre());
			}
		}
		// change disponible to emprunté
		oeuvre.setStatut("emprunté");
		String className = oeuvre.className;
		System.out.println("Vous avez bien emprunté : ");
		System.out.println("-->"+className+" : "+oeuvre.getTitre());
		System.out.println(" ");
		
	}
	/**Rendre une oeuvre
	 * la fonctiondoit aller chercher la liste d'emplacement
	 * @param Oeuvre oeuvre
	 */
	@Override
	public void rendreOeuvre(Oeuvre oeuvre) {
		//List<Emplacement> emplacements;
		//rangerUneOeuvre(oeuvre, emplacements);
	}

	@Override
	public boolean existeLivre(String intitule) {
		// test in arrayList
		return false;
	}
	
	//SURCHARGE fn qui n'est pas dans parent Interface
	public String test(){
		return "passage dans test";
		
	}
	public void test(String s){
		
		System.out.println(this.test()+s);
		
	}
	public void test(int s){
		
		System.out.println(this.test()+s);
		
	}



	



	


	
	

}
