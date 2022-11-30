package ilkSoru;

public class sekil {
	public static void sekilKodu() {
		int i,k;
		int boyut = 0;
		int z,j;
        int sembol=7;
       
        int sayi = 7;
		
        for(z =0;z<3;z++){
            for(j =0 ; j<sayi;j++){
                System.out.print("*");
            }
            System.out.println("");
            }
    	        
            for(k=0; k<7; k++) {
            for (i=0; i <sembol; i++) {
               System.out.print("*");
            }
            System.out.println("");
            sembol--;
        }
        }
		
		
	
	public static void main(String[] args) {
		sekilKodu();

	}

}
