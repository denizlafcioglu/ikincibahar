package com.basic.Odev_6_22217;

import java.util.Scanner;

import com.basic.Odev_6_22217.Odev_6_Fonk;

public class Odev_6_22217 {
	public static void main(String[] args) {
		Integer islem = null;
		Float Result = null;
		Integer stop = null;
		System.out.println("Toplama 1");
		System.out.println("��karma 2");
		System.out.println("�arpma 3");
		System.out.println("B�lme 4");
		System.out.println("yapmak istedi�iniz i�lemi se�in");
		Scanner input = new Scanner(System.in);
		islem = input.nextInt();

		

			if (islem == 1) {
				Result = Odev_6_Fonk.addition();

			}
			if (islem == 2) {
				Result = Odev_6_Fonk.subtraction();
			}
			if (islem == 3) {
				Result = Odev_6_Fonk.multiplication();
			}
			if (islem == 4) {
				Result = Odev_6_Fonk.division();
			}

			System.out.println("sonu�: " + Result);
	
	}

}
