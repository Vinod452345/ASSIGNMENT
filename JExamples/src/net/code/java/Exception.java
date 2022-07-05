package net.code.java;

public class Exception {

   public static void main(String args[]) {
      try {
         int a[] = new int[2];
         System.out.println("Access element three :" + a[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
   }
}
//output
//Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
//Out of the block