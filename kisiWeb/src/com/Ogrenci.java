package com;

public class Ogrenci extends Kisi {
	private int okulNo;
	private String bolum;
	private String memleket;
	
	public int getOkulNo() {
		return okulNo;
	}
	public void setOkulNo(int OkulNo) {
		okulNo = OkulNo;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String Bolum) {
		bolum = Bolum;
	}
	public String getMemleket() {
		return memleket;
	}
	public void setMemleket(String Memleket) {
		memleket = Memleket;
	}
	public void Ders() {
		System.out.println("Dersteyim.");
	}
	public void Kantin() {
		System.out.println("Kantindeyim.");
	}
}
