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
				System.out.println("i�leminiz tamamlanm��t�r.");
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
				System.out.println("i�eminiz tamamlanm��t�r");
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
				System.out.println("i�eminiz tamamlanm��t�r");
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
				System.out.println("i�leminiz tamamlanm��t�r");
				done = false;
			}
		}
		return sayi_1 / result;
	}

	private static float getValue() {
		
		Scanner Input = new Scanner(System.in);
		System.out.println(numNum + ".say�y� giriniz");
		value = Input.nextFloat();
		numNum++;
		return value;
	}

}

/*
 * Metod isminde ve de�i�kenlerde T�rk�e karakter bulunmamal�d�r.
 * 
 * Metodlar i�erisinde kullan�lan de�i�ken isimleri �ngilizce olmal�d�r.
 * 
 * Aritmetik i�lemler yapan fonksiyonlar i�erisinde kod tekrar� bulunmaktad�r,
 * metodlar i�erisindeki sadece ilgili aritmetik i�lemler yap�lmal�, geri kalan,
 * tekrar eden k�s�mlar ayr� bir fonksiyon olarak tan�mlanmal� ve fonksiyonlar
 * i�erisinden �a��r�lmal�d�r.
 * 
 * �DEVLER �dev 1 : Kullan�c�dan i�lem t�r� bilgisi al�nacak, �rne�in toplama
 * i�in 1, �arpma i�in 2 giriniz gibi. Ard�ndan kullan�c� s�n�rs�z say�da rakam
 * girebilecek, ��kmak yani sonucu hesaplatmak i�in herhangi bir harfe basacak.
 * Bu kontrol i�in �zel bir exception tan�mlanmal� ve bu exception olu�up
 * olu�mad��� kontrol edilmelidir.
 * 
 * �dev 2 : Kullan�c� hesap makinesi �rne�inde hesaplatmak istedi�i rakamlar�
 * txt dosyas�ndan alabilecek. Bunun i�in kullan�c�ya rakamlar� manuel olarak m�
 * yoksa dosyadan m� girece�i sorulmal�, dosyadan se�ene�ini se�erse dosya yolu
 * istenmelidir. Al�nan dosyan�n varl��� kontrol edildikten sonra (try-catch
 * mekanizmas� ile) i�erisinde alt alta yaz�l� rakamlara kullan�c�n�n istedi�i
 * aritmetik i�lem uygulanmal� ve sonu� hesaplanmal�d�r.
 * 
 */