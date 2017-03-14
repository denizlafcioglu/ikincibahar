package com.basic.Odev_3_2617;

import java.util.Scanner;

public class Odev_3_2617 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int num_1;
		int num_2;
		
		System.out.println("ilk sayýyý giriniz");
		num_1=input.nextInt();
		
		System.out.println("ikinci sayýyý giriniz");
		num_2=input.nextInt();
		
		buyuk(num_1,num_2);
	
		
	
	}

	private static void buyuk(int num_1, int num_2) {
		
		if (num_1>num_2) {
			System.out.println("büyük sayý Num 1: "+num_1);
		}
		else  if(num_1<num_2){
        	System.out.println("büyük sayý Num 2: "+num_2);
        }
        else{
        	System.out.println("num1 = num2: " +num_2);
        }
		
	}

	
}


/*public  buyuk (int x ,int y) {
		if (x>y) {
			System.out.println("büyük sayý Num 1: "+x);
		}
        if(x<y){
        	System.out.println("büyük sayý Num 2: "+y);
        }
        else{
        	System.out.println("num1 = num2: "+x);
        }
	}
*/