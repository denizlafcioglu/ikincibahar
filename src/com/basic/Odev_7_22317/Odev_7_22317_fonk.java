package com.basic.Odev_7_22317;

import java.util.Scanner;

public class Odev_7_22317_fonk {
	static float result = (float) 1.0;

	static boolean done = true;
	static float value = (float) 0.0;
	static int numNum = 1;

	public static float additional() {

		while (done == true) {
			try {
				result += getValue();
			} catch (Exception e) {
				System.out.println("iþleminiz tamamlanmýþtýr.");
				done = false;
			}

		}
		return result - 1;
	}

	public static float subtraction() {
		float sayi_1 = getValue();

		while (done == true) {

			try {
				result += getValue();
			} catch (Exception e) {
				System.out.println("iþeminiz tamamlanmýþtýr");
				done = false;

			}
		}
		return sayi_1 - result+1 ;
	}

	public static float multiplication() {
		while (done == true) {
			try {
				result = result * getValue();

			} catch (Exception e) {
				System.out.println("iþeminiz tamamlanmýþtýr");
				done = false;
			}
		}
		return result;
	}

	public static float division() {
		float sayi_1 = getValue();
		while (done == true) {
			try {
				result = result * getValue();
			} catch (Exception e) {
				System.out.println("iþleminiz tamamlanmýþtýr");
				done = false;
			}
		}
		return sayi_1 / result;
	}

	private static float getValue() {
		
		Scanner Input = new Scanner(System.in);
		System.out.println(numNum + ".sayýyý giriniz");
		value = Input.nextFloat();
		numNum++;
		return value;
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