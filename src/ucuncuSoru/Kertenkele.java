package ucuncuSoru;

public class Kertenkele extends Surungen {
	
	public Kertenkele(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi,boolean hareket) {
		super(ad, kilosu, uzunlugu, tehlikeliMi, hareket);
		
	}

	@Override
	String sesCikar() {
		return "Kertenkele ibik";
		
	}

	@Override
	boolean surun() {
		
		return true;
		
		
	}

	@Override
	public String toString() {
		return "Kertenkele [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikeliMi=" + tehlikeliMi
				+ "]";
	}

	

}
