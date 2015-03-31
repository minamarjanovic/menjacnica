package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicainterfejs.menjacnicaInterfejs;

public class Menjacnica implements menjacnicaInterfejs {
	
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();

	@Override
	public void dodajKurs(Kurs kurs) {
		if (kurs == null)
			throw new RuntimeException("Kurs ne sme biti null");
		
		if (kursevi.contains(kurs))
			throw new RuntimeException("Kurs postoji");
		
		kursevi.add(kurs);
		

	}

	@Override
	public void obrisiKurs(Kurs kurs) {
		if (kurs == null)
			throw new RuntimeException("Kurs ne sme biti null");
		
		if (!kursevi.contains(kurs))
			throw new RuntimeException("Kurs ne postoji");
		
		kursevi.remove(kurs);
		
	}

	@Override
	public double pronadjiIVrati(GregorianCalendar datum) {
		if(datum == null) {
			return 0;
		}
		double pom = 0.0;
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).getDatum().equals(datum)) {
				pom = kursevi.get(i).getSrednjiKurs();
				break;
			}
			
		}
		return pom;	
	}
	
}