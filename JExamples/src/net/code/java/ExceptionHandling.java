package net.code.java;

public class ExceptionHandling {

	   public static void main(String args[]) {
	      int a[] = new int[2];
	      try {
	         System.out.println("Access element three :" + a[3]);//try block
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown  :" + e);//catch
	      }finally {
	         a[0] = 6;
	         System.out.println("First element value: " + a[0]);
	         System.out.println("The finally statement is executed");//finally block
	      }
	   }
	}
//output
//Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
//First element value: 6
//The finally statement is executed
