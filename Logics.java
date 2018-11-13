import java.util.Scanner;

	class Logics{
	public static void main(String args[]){

	Scanner obj = new Scanner(System.in);
 
int num1;
int num2;
int d1,d2;
double p1,p2;
double r1,r2;
double po1,po2;
int sum;
int diff;
double product; 
double ratio;
double pow;
System.out.println("welcome to the platform of logics\n");

System.out.println("Enter First five digit number for addition");
num1= obj.nextInt();

System.out.println("Enter Second Five digit number for addition");
num2= obj.nextInt();

sum= num1 + num2;

System.out.println("Enter First five digit number for substraction");
d1= obj.nextInt();

System.out.println("Enter Second Five digit numberfor substraction");
d2= obj.nextInt();

System.out.println("Your total sum is "+sum);

diff= d1 - d2;
System.out.println("\nYour diffrence is "+diff);


System.out.println("Enter First five digit number for multiplication");
p1= obj.nextDouble();

System.out.println("Enter Second Five digit number for multiplication");
p2= obj.nextDouble();

product= p1 * p2;
System.out.println("\nYour product is "+product);

System.out.println("Enter First five digit number for division");
r1= obj.nextDouble();

System.out.println("Enter Second Five digit number for division");
r2= obj.nextDouble();

ratio= r1 % r2;

System.out.println("\nYour quotient is "+ratio);

System.out.println("Enter First five digit number for power");
po1= obj.nextDouble();

System.out.println("Enter Second Five digit number for power");
po2= obj.nextDouble();

pow= (po1*po1) + (po2*po2);

System.out.println("\nYour power is "+pow);



		}
	}
