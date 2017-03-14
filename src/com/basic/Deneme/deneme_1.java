package com.basic.Deneme;
import java.io.*; 
public class deneme_1 {
public static void main(String[] args) {
	
	   try { 
		      File file = new File("data.txt"); 
		      FileInputStream fis = new FileInputStream(file); 
		      int c; 
		      
		      while ((c = fis.read()) != -1) { 
		        System.out.print((char)c); 
		      } 
		      fis.close(); 
		    } 
		    catch (FileNotFoundException fnfe) { } 
		    catch (IOException ioe) { } 
		  } 
}
