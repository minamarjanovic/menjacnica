package menjacnicainterfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;
import menjacnica.Valuta;

public interface menjacnicaInterfejs {
	
	public void dodajKurs(Kurs kurs);
	public void obrisiKurs(Kurs kurs);
	public void pronadjiIVrati(double prodajniKurs, double srednjiKurs, double kupovniKurs, GregorianCalendar datum, Valuta valuta);
	

}
