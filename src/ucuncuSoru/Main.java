package ucuncuSoru;

public class Main {

	public static void main(String[] args) {
HayvanatBahcesi hayvanatBahcesi=new HayvanatBahcesi();
		Aslan aslan=new Aslan("Simba",100,120,true,false);
		Yılan yılan=new Yılan("Terminator",40,225,true,true);
		Maymun maymun=new Maymun("Maym",240,170,true,true);
		Kertenkele kertenkele=new Kertenkele("Kerke",5,15,true,true);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(aslan);
		hayvanatBahcesi.bahceyeSurungenEkle(yılan);
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Aslan("Leo",120,140, false,false));
		hayvanatBahcesi.bahceyeMemeliHayvanEkle(new Maymun("Ciko",45,50, false,false));
		hayvanatBahcesi.bahceyeSurungenEkle(new Yılan("Cobra",35,200, true,true));
		hayvanatBahcesi.bahceyeSurungenEkle(new Kertenkele("Kermit",2,35, true,true));
	
		hayvanatBahcesi.hayvanSesCikarsin(aslan);
		hayvanatBahcesi.hayvanSesCikarsin(yılan);
		hayvanatBahcesi.hayvaninBilgileriniYazdir(aslan);
		hayvanatBahcesi.hayvaninBilgileriniYazdir(yılan);
		
		hayvanatBahcesi.hayvaniHareketEttir(aslan);
		hayvanatBahcesi.hayvaniHareketEttir(yılan);
		
		hayvanatBahcesi.hayvaninCinsiniBul(yılan);
		
	}

}
