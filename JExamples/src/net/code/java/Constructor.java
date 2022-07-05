package net.code.java;

public class Constructor {
	   int num;
	   Constructor() {
	      num = 100;
	   }//Constructor creation
	}
class ConsDemo {
	   public static void main(String args[]) {
	      Constructor t1 = new Constructor();
	      Constructor t2 = new Constructor();
	      System.out.println(t1.num + " " + t2.num);
	   }
	}