package com.basic.Odev_7_22317;

import java.util.Scanner;

public class Odev_7_22317 {

	public static void main(String[] args) {
		Integer islem = null;
		Float result = null;
		int chosen = 0;
		System.out.println("Say� de�erlerini dosyadan y�klemek i�in 1'e");
		System.out.println("Manuel girmek i�i 2'e girin..");
		Scanner input = new Scanner(System.in);
		chosen = input.nextInt();

		System.out.println("Toplama 1");
		System.out.println("��karma 2");
		System.out.println("�arpma 3");
		System.out.println("B�lme 4");
		System.out.println("yapmak istedi�iniz i�lemi se�in");

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
			
			System.out.println("sonu�: " + result);
			break;
		}

		

	}

	

}
