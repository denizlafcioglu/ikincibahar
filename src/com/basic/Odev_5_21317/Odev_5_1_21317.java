package com.basic.Odev_5_21317;

import java.util.Scanner;

public class Odev_5_1_21317 {

	public static void main(String[] args) {
	int numOfarray;	
    System.out.println("dizi alayým, kaçtane girecen");	
    Scanner input= new Scanner(System.in);
    numOfarray = input.nextInt(); 
    int array[]= new int [numOfarray];
    
    for(int i=0;i<array.length;i++){
    	System.out.println((i+1)+". sayýyý giriniz");
    	array[i]=input.nextInt();
    	
    }

	}
}
