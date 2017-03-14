package com.basic.Odev_7_22317;

import java.io.*;

public class Odev_7_22317_read {

	static void read(int islem) {
		// Float result=null;
		String str = "";
		String[] values = new String[3];
		float[] cValues = new float[3];
		Integer result = null;
		int i = 0;
		try {

			FileInputStream fstream = new FileInputStream("C:\\Users\\Packard Bell\\workspace\\oku\\data.txt");
			DataInputStream dstream = new DataInputStream(fstream);
			BufferedReader breader = new BufferedReader(new InputStreamReader(dstream));

			while ((str = breader.readLine()) != null) {
				values[i] = str;
				cValues[i] = Integer.parseInt(values[i]);

				i++;
			}

			if (islem == 1) {
				for (i = 0; i < cValues.length; i++) {
					Odev_7_22317_readFonk.additional_read(cValues[i]);

				}
				System.out.println(result);
			}
			breader.close();

		} catch (IOException e) {
			System.out.println("bir hata oluþtu");
		}

	}

}

/*
 * if (islem == 1) { result = (int)
 * Odev_7_22317_readFonk.additional_read(cValues[i]);
 * System.out.println("asasdas"); }
 * 
 * if (islem == 2) { result = (int)
 * Odev_7_22317_readFonk.additional_read(cValues[i]);
 * 
 * System.out.println("asasdas"); }
 * 
 */
