package com;

public class Ogretmen extends Kisi {
	private int sicilNo;
	private String bolum;
	
	public int getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(int SicilNo) {
		sicilNo = SicilNo;
	}
	public String getBolum() {
		return bolum;
	}
	public void setBolum(String Bolum) {
		bolum = Bolum;
	}
	public void Ders() {
		System.out.println("Dersteyim.");
	}
	public void Sinav() {
		System.out.println("Sınav yapıyorum.");
	}
}
