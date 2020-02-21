package com.furkankara;

public class Ogrenci {

	
	private String adi,soyadi;
	private int numarasi;
	Okul universitesi;

	
	//-------------------------------
	public Okul getUniversitesi() {
		return universitesi;
	}
	public void setUniversitesi(Okul universitesi) {
		this.universitesi = universitesi;
	}
	//--------------------------------
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	//---------------------------------
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	//-----------------------------------
	public int getNumarasi() {
		return numarasi;
	}
	public void setNumarasi(int numarasi) {
		this.numarasi = numarasi;
	}
	
	
	
}
