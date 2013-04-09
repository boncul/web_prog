
public class Memur extends Kisi{
	private int sicilNo;
	private String birim;

	public int getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(int sicilNo) {
		sicilNo = sicilNo;
	}
	public String getBirim() {
		return birim;
	}
	public void setBirim(String birim) {
		birim = birim;
	}
	public void evrakGetir() {
		System.out.println("Evrak getiriyorum.");
	}
	public void evrakGotur() {
		System.out.println("Evrak götürüyorum.");
	}
}

