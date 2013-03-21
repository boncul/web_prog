
public class Ogretmen extends Kisi {
	private int sicilNo;
	private String bolum;
	
	public int getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(int sicilNo) {
		sicilNo = sicilNo;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String bolum) {
		bolum = bolum;
	}
	public void Ders() {
		System.out.println("Dersteyim.");
	}
	public void Sinav() {
		System.out.println("Sınav yapıyorum.");
	}
}

