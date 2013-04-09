
public class Ogrenci extends Kisi {
	private int okulNo;
	private String bolum;
	private String memleket;
	
	public int getOkulNo() {
		return okulNo;
	}
	public void setOkulNo(int okulNo) {
		okulNo = okulNo;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		bolum = bolum;
	}
	public String getMemleket() {
		return memleket;
	}
	public void setMemleket(String memleket) {
		memleket = memleket;
	}
	public void Ders() {
		System.out.println("Dersteyim.");
	}
	public void Kantin() {
		System.out.println("Kantindeyim.");
	}
}

