package ucuncuSoru;

public class Aslan extends MemeliHayvan {
	
	public Aslan(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi,boolean hareket) {
		super(ad, kilosu, uzunlugu, tehlikeliMi, hareket);
		
	}

	@Override
	boolean yuru() {
		return true;
		
		
	}

	@Override
	String sesCikar() {
		return "Aslan roar";
		
		
	}

	@Override
	public String toString() {
		return "Aslan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + ", tehlikeliMi=" + tehlikeliMi
				+ "]";
	}

	

}
