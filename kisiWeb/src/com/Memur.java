package com;

public class Memur extends Kisi {
	private int sicilNo;
	private String birim;

	public int getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(int SicilNo) {
		sicilNo = SicilNo;
	}
	public String getBirim() {
		return birim;
	}
	public void setBirim(String Birim) {
		birim = Birim;
	}
	public void evrakGetir() {
		System.out.println("Evrak getiriyorum.");
	}
	public void evrakGotur() {
		System.out.println("Evrak götürüyorum.");
	}
}
