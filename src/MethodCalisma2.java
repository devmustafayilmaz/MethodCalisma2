
public class MethodCalisma2 {

	public static void main(String[] args) {
	
		System.out.println(topla(20,15));
		
		if(TekMiCiftMi(10)== true) {
			
			System.out.println("sayimiz çift sayidir.");
		}else 
		{
			System.out.println("sayimiz tek sayidir.");
			
		}//iki farklı yol ile methodlardan işlemleri nasıl çekileceği gösterilmiştir.
		
		System.out.println(pozitifMiNegatifMi(-6));
	    String sonucstr = pozitifMiNegatifMi(6);
	    
	    System.out.println(KareAl(25));
	    int KareSonuc= KareAl(9);
	    System.out.println(KareSonuc);
	    onIleCarp(KareSonuc);
	} 
	public static int topla(int sayi1, int sayi2) {
		int topla= sayi1+sayi2;
		return topla;
		
	}
	public static boolean TekMiCiftMi(int sayi) {
		if(sayi%2==0) {
			
			return true;
		}else {
			return false;
		}
		
	} 
	public static String pozitifMiNegatifMi(int sayi) {
		if(sayi>0) {
			return "sayi pozitiftir";
		}else 
		{
			return "sayi negatiftir.";
		}
	} public static int KareAl(int sayi) {
		int Kare = sayi*sayi;
		return Kare;
	} public static void onIleCarp(int sayi) {
		System.out.println(sayi*10);
	}
			

}
