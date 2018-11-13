import java.util.Scanner;

	class Exe{
public static void main(String args[]){

Scanner obj= new Scanner(System.in);

int n1;
int n2;
int n3;
int average;
int product;
int sum;

System.out.println("Welcome to the exercise 2.17");

System.out.println("Enter First number\n");
n1= obj.nextInt();

System.out.println("Enter Second Number\n");
n2= obj.nextInt();

System.out.println("Enter third Number\n");
n3= obj.nextInt();

System.out.println("for sum\n");
sum= n1 + n2 + n3;

System.out.println("\nthe total sum of three numbers are" +sum);


System.out.println("for average\n");
average= (n1 + n2 + n3)/3;
System.out.println("the average of three numbers is \n" + average);

System.out.println("for product\n");
product= n1*n2*n3;
System.out.println("the product of three numbers is\n " + product);

System.out.println("for larger number\n");

if (n1>n2)
System.out.println("first number is greater\n");
if(n1>n3)
System.out.println("first number is greater\n");
if(n2>n1)
System.out.println("second number is greater\n");
if(n2>n3)
System.out.println("second number is greater\n");
if(n3>n1)
System.out.println("third number is greater\n");
if(n3>n2)
System.out.println("third number is greater\n");

System.out.println("for smaller number\n");
if(n1<n2)
System.out.println("first number is smaller");
if(n1<n3)
System.out.println("first number is smaller\n");
if(n2<n1)
System.out.println("second number is smaller\n");
if(n2<n3)
System.out.println("second number is smaller\n");
if(n3<n1)
System.out.println("third number is smaller\n");
if(n3<n2)
System.out.println("third number is smaller\n");
}
		}