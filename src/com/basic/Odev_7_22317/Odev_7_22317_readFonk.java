package com.basic.Odev_7_22317;

public class Odev_7_22317_readFonk {
	static float result = (float) 1.0;

	static boolean done = true;
	static float value = (float) 0.0;
	
	public static float  additional_read(float value) {

		while (done == true) {
			try {
				result += value;
			} catch (Exception e) {
				System.out.println("iþleminiz tamamlanmýþtýr.");
				done = false;
			}

		}
		return result;
	}

	public static float subtraction(float value) {
		float sayi_1 = value;

		while (done == true) {

			try {
				result += value;
			} catch (Exception e) {
				System.out.println("iþeminiz tamamlanmýþtýr");
				done = false;

			}
		}
		return sayi_1 - result - 1;
	}

	public static float multiplication(float value) {
		while (done == true) {
			try {
				result = result * value;

			} catch (Exception e) {
				System.out.println("iþeminiz tamamlanmýþtýr");
				done = false;
			}
		}
		return result;
	}

	public static float division() {
		float sayi_1 = value;
		while (done == true) {
			try {
				result = result * value;
			} catch (Exception e) {
				System.out.println("iþleminiz tamamlanmýþtýr");
				done = false;
			}
		}
		return sayi_1 / result;
	}
}
