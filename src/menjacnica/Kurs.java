package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Kurs {

	private double prodajniKurs, srednjiKurs, kupovniKurs;
	private GregorianCalendar datum;
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		this.prodajniKurs = prodajniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		this.srednjiKurs = srednjiKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		this.kupovniKurs = kupovniKurs;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		this.datum = datum;
	}
	public LinkedList<Valuta> getValute() {
		return valute;
	}
	public void setValute(LinkedList<Valuta> valute) {
		this.valute = valute;
	}
	
}
