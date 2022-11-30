package ucuncuSoru;

public abstract class Surungen extends Hayvan {

	

	public Surungen(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi,boolean hareket) {
		super(ad, kilosu, uzunlugu, tehlikeliMi, hareket);
	}
	
	abstract boolean  surun();

}
