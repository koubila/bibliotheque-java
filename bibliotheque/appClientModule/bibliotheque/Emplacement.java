package bibliotheque;

import java.util.List;

public class Emplacement {
	
	private String rangee;
	private int etagere;
	private int emplacement;
	private Oeuvre oeuvre;
	
	
	//Constructor
	public Emplacement(String rangee,int etagere, int emplacement ) {
		this.rangee = rangee;
		this.etagere = etagere;
		this.emplacement = emplacement;
	}
	
	
	public String getRangee() {
		return rangee;
	}
	public void setRangee(String rangee) {
		this.rangee = rangee;
	}
	public int getEtagere() {
		return etagere;
	}
	public void setEtagere(int etagere) {
		this.etagere = etagere;
	}
	public int getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(int emplacement) {
		this.emplacement = emplacement;
	}
	
	
	
	@Override
	public String toString() {
		return "rangée "+this.getRangee()+" ,étagère "+ this.getEtagere() + ",empl. "+this.getEmplacement();
		
	}


	public Oeuvre getOeuvre() {
		return oeuvre;
	}


	public void setOeuvre(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
	}


	
	
}

