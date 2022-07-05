package net.code.java;

public class Variabletype {
	   public void pupAge() {
	      int age = 0;
	      age = age + 7;
	      System.out.println("Puppy age is : " + age);
	   }

	   public static void main(String args[]) {
	      Variabletype test = new Variabletype();
	      test.pupAge();
	   }
	}
//output
//Puppy age is : 7
