package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnicainterfejs.menjacnicaInterfejs;

public class Menjacnica implements menjacnicaInterfejs {
	
	private LinkedList<Kurs> kursevi = new LinkedList<Kurs>();
	
	@Override
	public void dodajKurs(Kurs kurs) {
		if(kurs == null) {
			throw new RuntimeException("Kurs ne sme biti null");
		}
		
		for (int i = 0; i < kursevi.size(); i++) {
			if(kursevi.get(i).equals(kurs)) {
				System.out.println("Kurs vec postoji");
				return;
			}	
		}
		kursevi.add(kurs);

	}

	@Override
	public void obrisiKurs(Kurs kurs) {
		

	}

	@Override
	public double pronadjiIVrati(GregorianCalendar datum) {
		
		return 0;
	}

}
