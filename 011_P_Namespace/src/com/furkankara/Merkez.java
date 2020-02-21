package com.furkankara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Ogrenci ogrenci = (Ogrenci) context.getBean("beanOgrenci");
		
		System.out.println("Adı : " +ogrenci.getAdi());
		System.out.println("Soyadı : " +ogrenci.getSoyadi());
		System.out.println("Numarası : " +ogrenci.getNumarasi());
		System.out.println("Üniversitesi : " +ogrenci.getUniversitesi().getKurumadi());

	}

}
