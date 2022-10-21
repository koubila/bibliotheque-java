package test;

//import java.io.*;
import static java.lang.System.*;
import java.sql.Timestamp;
import tools.AfficheHelper;

import java.util.ArrayList;
import java.util.List;
import bibliotheque.*;

public class Main {
/*Sujet :
 * 
 * 	Emplacement : Rangée (A .. E), Etagère(1..4), Emplacement (0..49)
 * 	Oeuvre = Ouvrage et Media
 * 	Ouvrage = Livre et Magazine
 * 	Media = Jeu et Film
 * 
 *  Livre : auteur,	
 *	Magazine: date publication
 * 	Jeu: age limite, editeur, support, plateforme (xbox,mac,android,...) 
 * 	Film: realisateur, acteur, age limit,
 * 
 * 	Tous: genre, titre, support(dvd, ddl, usb, audio, numerique), statut(dispo, emprunté, archivé),
 *  nb exemplaires 
 *  String editeur,  String genre, String support, String statut) {
 * */

	public static void main(String[] args) {
	    //créé des livres en dur
	    Livre livre1 = new Livre("L'école des sorciers","J.K",1,"G.Jeunesse","Fantastique","Papier","disponible");
	    Livre livre2 = new Livre("Lucky Luke","Morris",2,"Dargaud","FarWest","Papier","disponible");
	    Livre livre3 = new Livre("Tintin au tibet","Hergé",4,"G.Jeunesse","Aventure","Papier","disponible");
	    Livre livre4 = new Livre("Les fourmis","Werber",1,"G.Jeunesse","Science-fiction","Numérique","disponible");
	    Livre livre5 = new Livre("Voyage au centre de la terre","J.Verne",1,"Poche","Voyage","Numérique","disponible");
	    
	    //mets les livres dans une List
	    ArrayList<Livre> lesLivres = new ArrayList<Livre>();
	    lesLivres.add(livre1);
	    lesLivres.add(livre2);
	    lesLivres.add(livre3);
	    lesLivres.add(livre4);
	    lesLivres.add(livre5);
	    out.println("Main - Livres :"+lesLivres);
	    out.println(" ");
	    
	    //créé des magazines en initiant par le seeder-faker
	    List<Magazine> mags = OeuvreFaker.initMagazines();
	    out.println(" ");
	    
	    //créé des films en initiant par le seeder-faker
	    List<Film> films = OeuvreFaker.initFilms();
	    out.println(" ");
	    
	    //créé des jeux en initiant par le seeder-faker
	    List<Jeu> jeux = OeuvreFaker.initJeux();
	    out.println(" ");
	    
	    //créé des emlacements en initiant par le seeder-faker
	    List<Emplacement> emplacements = OeuvreFaker.initEmplacements();
	    out.println(" ");
	    
	    //SINGLETON affiche une List via Helper , on sera sur que tout le monde affichera pareil de partout.
	    AfficheHelper afficheHelper = AfficheHelper.getInstance();
	    //afficheHelper.rechercherListe(lesLivres);
	    afficheHelper.rechercherUneListe(emplacements);
	    afficheHelper.rechercherUneListe(films);
	    out.println(" ");
	    
	    //appel de fn depuis Contrat implements ContratInterface
	    Contrat monRangement = new Contrat();
	    //Range une oeuvre une à une
	    monRangement.rangerUneOeuvre(livre1, emplacements);
	    monRangement.rangerUneOeuvre(jeux.get(1), emplacements);
	    
	    //CASTE une liste de film/magazine en oeuvre, //List<A> listA = new ArrayList<A>(listB);
	    List<Oeuvre> films2 = new ArrayList<Oeuvre> (films);
	    List<Oeuvre> magazines2 = new ArrayList<Oeuvre> (mags);
	    List<Oeuvre> jeux2 = new ArrayList<Oeuvre> (jeux);
	    List<Oeuvre> livres2 = new ArrayList<Oeuvre> (lesLivres);
	    
	    //Range toutes les oeuvres 
	    monRangement.rangerToutesLesOeuvres(films2,emplacements);
	    monRangement.rangerToutesLesOeuvres(magazines2,emplacements);
	    monRangement.rangerToutesLesOeuvres(jeux2,emplacements);
	    monRangement.rangerToutesLesOeuvres(livres2,emplacements);
	    
	    //Emprunte une oeuvre
	    monRangement.emprunterOeuvre(livre5, emplacements);
	    monRangement.emprunterOeuvre(films.get(0), emplacements);
	    afficheHelper.rechercherUneListe(films);
	    afficheHelper.rechercherUneListe(livres2);
	    afficheHelper.rechercherUneListe(emplacements);
	    out.println(" ");
	    
	    //Rends une Oeuvre
	    
	    
	    
	    //instancie une fn test() depuis Contrat
	    //Contrat monContrat = new Contrat();
	    //monContrat.test();
	    //SURCHARGE une methode, attention signature
	    //monContrat.test("surcharge string");
	    //monContrat.test(2022);
	 
	    
	    
	    
	}
	
	

}