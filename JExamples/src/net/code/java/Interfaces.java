package net.code.java;

import java.util.*;
interface sport
{
static final double sportwt=7.0;
public void putwt();
}
class student
{
public int rollno;
Scanner sc=new Scanner(System.in);
public void getno()
{
System.out.println("Enter roll no of student:");
rollno=sc.nextInt();
}
public void putno()
{
System.out.println("Roll no="+rollno);
}
}
class test extends student
{
public float m1,m2;
Scanner sc=new Scanner(System.in);
public void getmarks()
{
System.out.println("Enter marks of subject 1:");
m1=sc.nextFloat();
System.out.println("Enter marks of subject 2:");
m2=sc.nextFloat();
}
public void putmarks()
{
System.out.println("S1 Marks=&quot;+m1");
System.out.println("S2 Marks="+m2);
}
}
class result extends test implements sport
{
double total;
void display()
{
total=m1+m2+sportwt;
System.out.println("Total marks="+total);
}
public void putwt()
{
System.out.println("Sports weight="+sportwt);
}
}
public class Interfaces
{
public static void main(String arg[])
{
result r=new result();
r.getno();
r.getmarks();
System.out.println("Rseult of Student:");
r.putno();
r.putmarks();
r.putwt();
r.display();
}
}//output
/*Enter roll no of student:
1
Enter marks of subject 1:
20
Enter marks of subject 2:
55
Rseult of Student:
Roll no=1
S1 Marks=&quot;+m1
S2 Marks=55.0
Sports weight=7.0
Total marks=82.0*/
