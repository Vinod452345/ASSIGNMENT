package net.code.java;

public class Strings {

	   public static void main(String args[]) {
	      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	      String helloString = new String(helloArray);  
	      System.out.println( helloString );// Converting array to string
	      String palindrome = "Dot saw I was Tod";
	      int len = palindrome.length();
	      System.out.println( "String Length is : " + len );// getting the length of a string
	      String string1 = "saw I was ";
	      System.out.println("Dot " + string1 + "Tod");//Concating a string 
	      
	   }
	}
//output
//hello.
//String Length is : 17
//Dot saw I was Tod
