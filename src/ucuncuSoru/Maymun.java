package ucuncuSoru;

public class Maymun extends MemeliHayvan{
	
	public Maymun(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi,boolean hareket) {
		super(ad, kilosu, uzunlugu, tehlikeliMi, hareket);
		
	}

	@Override
	boolean yuru() {
		return true;
		
	}

	@Override
	String sesCikar() {
		return "Maymun uaa";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Maymun [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikeliMi=" + tehlikeliMi
				+ "]";
	}

}
