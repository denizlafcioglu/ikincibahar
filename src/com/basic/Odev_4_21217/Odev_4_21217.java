package com.basic.Odev_4_21217;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Odev_4_21217 {
	
	public static void main(String[] args) {
		int numOfarray=0;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Kaç Sayý giraceksiniz");
		numOfarray= input.nextInt();
		int[] array = new int [numOfarray];
		
		
		for(int i=1;i<1+array.length;i++){
			array[i-1]= siralaVebastir(i);
			
		}
		
		
		for(int z=0;z<array.length;z++){
			System.out.println("num"+(z+1)+" "+ array[z]);
		}
		
	}
	

	    public static int siralaVebastir(int i) {
	    	
	    int num;
		System.out.println((i)+". sayýyý giriz");
		Scanner input= new Scanner(System.in);
		num=input.nextInt();
		return num;
	}

	
	
}
