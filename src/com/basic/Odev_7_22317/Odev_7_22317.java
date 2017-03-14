package com.basic.Odev_7_22317;

import java.util.Scanner;

public class Odev_7_22317 {

	public static void main(String[] args) {
		Integer islem = null;
		Float result = null;
		int chosen = 0;
		System.out.println("Sayý deðerlerini dosyadan yüklemek için 1'e");
		System.out.println("Manuel girmek içi 2'e girin..");
		Scanner input = new Scanner(System.in);
		chosen = input.nextInt();

		System.out.println("Toplama 1");
		System.out.println("çýkarma 2");
		System.out.println("Çarpma 3");
		System.out.println("Bölme 4");
		System.out.println("yapmak istediðiniz iþlemi seçin");

		islem = input.nextInt();

		switch (chosen) {

		case 1:
			Odev_7_22317_read.read(islem); 
			break;

		case 2:


			if (islem == 1) {
				result = Odev_7_22317_fonk.additional();
			}
			if (islem == 2) {
				result = Odev_7_22317_fonk.subtraction();
			}
			if (islem == 3) {
				result = Odev_7_22317_fonk.multiplication();
			}
			if (islem == 4) {
				result = Odev_7_22317_fonk.division();
			}
			
			System.out.println("sonuç: " + result);
			break;
		}

		

	}

	

}
