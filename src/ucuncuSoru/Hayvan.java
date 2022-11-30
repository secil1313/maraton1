package ucuncuSoru;

public abstract class Hayvan {
	
	String ad;
	int kilosu;
	int uzunlugu;
	boolean tehlikeliMi;
	boolean hareket;
	
	public Hayvan(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi,boolean hareket) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
		this.tehlikeliMi = tehlikeliMi;
		this.hareket=hareket;
	}


	abstract String sesCikar();
	
}
