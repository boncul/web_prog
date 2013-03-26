package com;

public class Kisi {
	private int TCNo;
	private String ad;
	private String soyad;
	private int dogumTarihi;
	
	public int getTCNo() {
		return TCNo;
	}
	public void setTCNo(int tcNo) {
		TCNo = tcNo;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String Ad) {
		ad = Ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String Soyad) {
		soyad = Soyad;
	}
	public int getDogumTarihi() {
		return dogumTarihi;
	}
	public void setDogumTarihi(int DogumTarihi) {
		dogumTarihi = DogumTarihi;
	}
	public void Uyur() {
		System.out.println("Uyuyorum.");
	}
	public void Gezer() {
		System.out.println("Geziyorum.");
	}
}
