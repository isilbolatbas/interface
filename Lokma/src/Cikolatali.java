
public class Cikolatali extends Lokma {
	
	public int cikolataKalori=8;
	public int cilekKalori=6;
	public int cikolataTaneFiyat=7;
	public int servisFiyat;
	public int kalori;

	@Override
	public void lokmahazirla() {
		
		System.out.println("lokma hazirlaniyor.");
		
	}

	@Override
	public void fiyathesapla() {
		
		servisFiyat = cikolataTaneFiyat*7;
		System.out.println("FIYAT=" + servisFiyat);
		
	}

	@Override
	public void kalorihesapla() {
		
		kalori =((cikolataKalori*3)+(cilekKalori*2));
		
	}

	@Override
	public void sunumhazirla() {
		// TODO Auto-generated method stub
		System.out.println("sunum hazirlaniyor.");
		
	}

	@Override
	public void icerikgoster() {

		int x =kalori =((cikolataKalori*3)+(cilekKalori*2));
		System.out.println("3 tane cikolatali lokma 2 tane cileki lokma vardir");
		System.out.println("sade ve antepfistikli lokmanin toplam kalorisi:" + x);

		
	}


}
