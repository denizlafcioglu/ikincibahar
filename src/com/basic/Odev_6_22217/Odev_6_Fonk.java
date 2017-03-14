package com.basic.Odev_6_22217;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Odev_6_Fonk {

	static float result = (float) 0.0;

	static boolean done = true;
	static float value = (float) 0.0;

	public static Float addition() {
		while (done == true) {
			result = getValue() + result;
			addition();
		}
		return result;
	}

	public static Float subtraction() {
		return null;
	}

	public static Float multiplication() {

		return null;
	}

	public static Float division() {

		return null;
	}

	private static float getValue() {
		int numNum = 1;

		do {
			try {
				Scanner Input = new Scanner(System.in);
				System.out.println(numNum + ".sayýyý giriniz");
				value = Input.nextFloat();
				numNum++;
				return value;

			} catch (Exception e) {
				System.out.println("iþleminiz tamamlnamýþtýr");
				done = false;
				return value;

			}

		} while (done == true);

	}

}

/*
 * Metod isminde ve deðiþkenlerde Türkçe karakter bulunmamalýdýr.
 * 
 * Metodlar içerisinde kullanýlan deðiþken isimleri Ýngilizce olmalýdýr.
 * 
 * Aritmetik iþlemler yapan fonksiyonlar içerisinde kod tekrarý bulunmaktadýr,
 * metodlar içerisindeki sadece ilgili aritmetik iþlemler yapýlmalý, geri kalan,
 * tekrar eden kýsýmlar ayrý bir fonksiyon olarak tanýmlanmalý ve fonksiyonlar
 * içerisinden çaðýrýlmalýdýr.
 * 
 * ÖDEVLER Ödev 1 : Kullanýcýdan iþlem türü bilgisi alýnacak, örneðin toplama
 * için 1, çarpma için 2 giriniz gibi. Ardýndan kullanýcý sýnýrsýz sayýda rakam
 * girebilecek, çýkmak yani sonucu hesaplatmak için herhangi bir harfe basacak.
 * Bu kontrol için özel bir exception tanýmlanmalý ve bu exception oluþup
 * oluþmadýðý kontrol edilmelidir.
 * 
 * Ödev 2 : Kullanýcý hesap makinesi örneðinde hesaplatmak istediði rakamlarý
 * txt dosyasýndan alabilecek. Bunun için kullanýcýya rakamlarý manuel olarak mý
 * yoksa dosyadan mý gireceði sorulmalý, dosyadan seçeneðini seçerse dosya yolu
 * istenmelidir. Alýnan dosyanýn varlýðý kontrol edildikten sonra (try-catch
 * mekanizmasý ile) içerisinde alt alta yazýlý rakamlara kullanýcýnýn istediði
 * aritmetik iþlem uygulanmalý ve sonuç hesaplanmalýdýr.
 * 
 */