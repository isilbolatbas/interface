import java.util.Scanner;

public abstract class Lokma implements Urun, Sunum {

	public abstract void lokmahazirla();

	public static void main(String[] args) {
		
		int x = 1;
 
		Cikolatali cikolatali = new Cikolatali();
		System.out.println("HOSGELDINIZ");
		System.out.println("1-Cikolatali lokma siparisi ver");
		System.out.println("2-Cilekli lokma siparisi ver");

		Scanner s = new Scanner(System.in);
		int tercih = s.nextInt();
		while( x ==1) {
		if (tercih == 1) {

			System.out.println("1-icerik goster");
			System.out.println("2-fiyat ogren");
			System.out.println("3-lokma hazirla");
			System.out.println("4-sunum hazirla");

			Scanner scan = new Scanner(System.in);
			int secenek = scan.nextInt();
			if (secenek == 1) {

				cikolatali.icerikgoster();

			} else if (secenek == 2) {

				cikolatali.fiyathesapla();

			} else if (secenek == 3) {

				cikolatali.lokmahazirla();

			} else {

				cikolatali.sunumhazirla();

			}

		} else if (tercih == 2) {
			
			
			Sade sade = new Sade();

			System.out.println("1-icerik goster");
			System.out.println("2-fiyat ogren");
			System.out.println("3-lokma hazirla");
			System.out.println("4-sunum hazirla");

			Scanner ss = new Scanner(System.in);
			int secenek = ss.nextInt();
			 
			
			if (secenek == 1) {

				sade.icerikgoster();

			} else if (secenek == 2) {

				sade.fiyathesapla();

			} else if (secenek == 3) {

				sade.lokmahazirla();

			} else {

				sade.sunumhazirla();

			}

		}

	}}

}
