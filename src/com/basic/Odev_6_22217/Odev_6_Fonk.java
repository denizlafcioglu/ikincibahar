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
				System.out.println(numNum + ".say�y� giriniz");
				value = Input.nextFloat();
				numNum++;
				return value;

			} catch (Exception e) {
				System.out.println("i�leminiz tamamlnam��t�r");
				done = false;
				return value;

			}

		} while (done == true);

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