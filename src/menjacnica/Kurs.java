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
		if(prodajniKurs == 0) {
		throw new RuntimeException("Prodajni kurs ne sme biti nula");
	}
		this.prodajniKurs = prodajniKurs;
	}
	
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs == 0) {
			throw new RuntimeException("Srednji kurs ne sme biti nula");
		}
		this.srednjiKurs = srednjiKurs;
	}
	
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs == 0) {
			throw new RuntimeException("Kupovni kurs ne sme biti nula");
		}
		this.kupovniKurs = kupovniKurs;
	}
	
	public GregorianCalendar getDatum() {
		return datum;
	}
	
	public void setDatum(GregorianCalendar datum) {
		if(datum == null) {
			throw new RuntimeException("Datum ne sme biti null.");
		}
		this.datum = datum;
	}
	
	public LinkedList<Valuta> getValute() {
		return valute;
	}
	
	public void setValute(LinkedList<Valuta> valute) {
		if(valute.isEmpty()) {
			throw new RuntimeException("Lista valuta ne sme biti prazna.");
		}
		this.valute = valute;
	}
	
	@Override
	public String toString() {
		return "Kurs [prodajniKurs=" + prodajniKurs + ", srednjiKurs="
				+ srednjiKurs + ", kupovniKurs=" + kupovniKurs + ", datum="
				+ datum + ", valute=" + valute + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((valute == null) ? 0 : valute.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kurs other = (Kurs) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double
				.doubleToLongBits(other.kupovniKurs))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double
				.doubleToLongBits(other.prodajniKurs))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double
				.doubleToLongBits(other.srednjiKurs))
			return false;
		if (valute == null) {
			if (other.valute != null)
				return false;
		} else if (!valute.equals(other.valute))
			return false;
		return true;
	}
	
}
