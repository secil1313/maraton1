package ucuncuSoru;

import java.util.ArrayList;
import java.util.List;

public class HayvanatBahcesi  {

	
	Aslan aslan;
	Maymun maymun;
	Yılan yılan;
	Kertenkele kertenkele;
	public List<Hayvan> hayvanListesi=new ArrayList<Hayvan>();
	
	
	public void bahceyeMemeliHayvanEkle(MemeliHayvan m) {
	System.out.println(m.ad+" hayvani bahceye gelmistir.");
	
	}
	public void bahceyeSurungenEkle(Surungen s) {
	
	
	}
	
	public void hayvanSesCikarsin(Hayvan h) {
		System.out.println(h.sesCikar()+" diye ses cikarir.");
	}

	public void hayvaninCinsiniBul(Hayvan hayvanAdi) {
		if(hayvanAdi.hareket==true) {
			System.out.println(hayvanAdi.ad+ " surungendir");}
			else {
				System.out.println(hayvanAdi.ad+ " yuruyor");
			}
	}

	public void hayvaninBilgileriniYazdir(Hayvan hayvanAdi) {
		System.out.println(hayvanAdi);
	}
	
	public void hayvaniHareketEttir(Hayvan hayvanAdi) {
		if(hayvanAdi.hareket==true) {
	System.out.println("Surunuyor");}
	else {
		System.out.println("Yuruyor");
	}
	}
	
	
	
	
}
