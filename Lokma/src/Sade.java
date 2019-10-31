
public class Sade extends Lokma  {
	
	
	
	public int sadeKalori=5;
	public int antepKalori=6;
	public int sadeTaneFiyat=6;
	public int servisFiyat;
	public int kalori;
	
	

	@Override
	public void fiyathesapla() {
		
		servisFiyat = sadeTaneFiyat*5;
		System.out.println("FIYAT=" + servisFiyat);
		
	}

	@Override
	public void kalorihesapla() {
		
		kalori =((sadeKalori*3)+(antepKalori*2));
		
	}

	@Override
	public void sunumhazirla() {


		System.out.println("sunum hazirlaniyor.");
		
	}

	@Override
	public void icerikgoster() {
		int x =((sadeKalori*3)+(antepKalori*2));
		System.out.println("3 tane sade lokma 2 tane antepfistikli lokma vardir");
		System.out.println("sade ve antepfistikli lokmanin toplam kalorisi:" + x);

	}

	@Override
	public void lokmahazirla() {
		
		System.out.println("lokma hazirlaniyor.");
		
	}
	
	
	
	

}
