package ucuncuSoru;

public abstract class MemeliHayvan extends Hayvan{

	
	public MemeliHayvan(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi,boolean hareket) {
		super(ad, kilosu, uzunlugu, tehlikeliMi, hareket);
	}

	abstract boolean yuru();
}
