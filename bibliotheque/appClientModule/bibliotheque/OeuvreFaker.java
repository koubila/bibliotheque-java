package bibliotheque;

import static java.lang.System.out;

import java.util.ArrayList;
import java.util.List;
import bibliotheque.*;
import tools.AfficheHelper;

public class OeuvreFaker {
	static List<Magazine>magazines = null;
	static List<Film>films = null;
	static List<Jeu>jeux = null;
	static List<Emplacement>emplacements = null;
	
	//Emplacement : Rangée (A .. E), Etagère(1..4), Emplacement (0..49)
	public static List<Emplacement> initEmplacements(){
		String[] rangee = {"A","B","C","D","E"};
				 
		 emplacements = new ArrayList<Emplacement>();
	
		 for (String r : rangee) {
			 //pour chaque array rangee, je veux setRangee(r)
			 for (int i = 1; i <= 4; i++) {
				 //setEtagere(i);
				for (int j = 0; j < 50; j++) {
					//setEmplacement(j);
					emplacements.add(new Emplacement(r,i,j));
					
				}
			}
		}
		 //Il y a 50 emplacements pour chacune des 4 étagères de chaque rangée.
		 System.out.println("Faker - Emplacement : "+emplacements);
		 return emplacements;
	}
	
	public static List<Magazine> initMagazines() {
		 magazines = new ArrayList<Magazine>();
		 
		 magazines.add(new Magazine("One Informatik",10,"Kiosque","Technologie","Papier","disponible"));
		 magazines.add(new Magazine("Picsou Mag",1,"Kiosque","B.D","Numérique","disponible"));
		 magazines.add(new Magazine("L'équipe",3,"Kiosque","Sport","Papier","disponible"));
		 magazines.add(new Magazine("Vogue",5,"Kiosque","Mode","Numérique","disponible"));
		 System.out.println("Faker - Magazine : " + magazines);
		 return magazines;

	}
	
	public static List<Film> initFilms(){
		 films = new ArrayList<Film>();
		 films.add(new Film("Black Adam",10,"D.Jhonson","Fantastique","Numerique","disponible"));
		 films.add(new Film("Harry Potter",1,"E.Watson","Fantastique","Numérique","disponible"));
		 films.add(new Film("Le grand bal",3,"P.Dupont","Danse","Numerique","disponible"));
		 films.add(new Film("Piaf",5,"M.Cotillard","Musicale","Numérique","disponible"));
		 System.out.println("Faker - Films : " + films);
		 return films;

	}
	public static List<Jeu> initJeux(){
		 jeux = new ArrayList<Jeu>();
		 
		 jeux.add(new Jeu("Call of duty",10,"Sega","Guerre","Numérique","disponible"));
		 jeux.add(new Jeu("Fortnite",1,"Konami","Tir","Numérique","disponible"));
		 jeux.add(new Jeu("Red Redemption",3,"Capcom","Aventure","Numérique","disponible"));
		 jeux.add(new Jeu("Mario bros",5,"Ubisoft","Aventure","Numérique","disponible"));
		 System.out.println("Faker - Jeux : " + jeux);
		 
		 return jeux;

	}

}
