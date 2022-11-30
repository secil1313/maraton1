package ucuncuSoru;

public class Yılan extends Surungen {
	
	public Yılan(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi,boolean hareket) {
		super(ad, kilosu, uzunlugu, tehlikeliMi, hareket);
		
	}

	@Override
	String sesCikar() {
		return "Yilan tss";
		
	}

	@Override
	boolean surun() {
		return true;
	
	
	}

	@Override
	public String toString() {
		return "Yilan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikeliMi=" + tehlikeliMi
				+ "]";
	}

}
