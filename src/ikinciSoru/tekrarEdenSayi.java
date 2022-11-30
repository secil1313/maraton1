package ikinciSoru;

public class tekrarEdenSayi {
	
	public static void tekrarEden(int liste[]) {
		int sayac = 0;
		int a = 0;
		
		for (int i = 0; i <liste.length; i++) { 
			for (int z = 1; i <liste.length; i++) {
			if(liste[i] == liste[z]){
				a=i;
				sayac++;
				
            }
            	
			}
        }
		if(sayac>1) {
		System.out.println( liste[a]+ " sayisi "+sayac+" kez tekrar ediyor.");}
		else {
        System.out.println("Tekrar eden sayi bulunamamistir.");}
    }
		
		
	public static void main(String[] args) {
		int sayiDizisi[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 };
		//int sayiDizisi[] = { 0, 1, 5, 3 };
		tekrarEden(sayiDizisi);
	}

}
