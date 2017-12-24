package fr.vifierlockla.coursjee.beans;

/**
 * 
 * @author vifie
 *
 */
public class Calcul {

	//-- Variables d'instance
	private int nombre1 = 0;
	private int nombre2 = 0;
	private String operation = "+";
	private int resultat = 0;
	
	public int getNombre1() {
		return nombre1;
	}
	public void setNombre1(int nombre1) {
		this.nombre1 = nombre1;
	}
	public int getNombre2() {
		return nombre2;
	}
	public void setNombre2(int nombre2) {
		this.nombre2 = nombre2;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public int getResultat() {
		return resultat;
	}
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
	
	public void calcResultat() {
		switch (operation) {
			case "+" : this.resultat = nombre1 + nombre2;
			break;
			case "-" : this.resultat = nombre1 - nombre2;
			break;
			case "x" : this.resultat = nombre1 * nombre2;
			break;
			case "/" : this.resultat = nombre1 / nombre2;
			break;
		}
	}
}
