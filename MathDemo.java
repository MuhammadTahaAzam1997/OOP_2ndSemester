import java.util.Scanner;
class MathDemo{

	public static void main(String args[]){
Scanner ab=new Scanner(System.in);
System.out.println("Enter a number");
double a=ab.nextDouble();
System.out.println("Enter a number");
double b=ab.nextDouble();


	Calculate obj=new Calculate(a,b);
	System.out.println("Addition is "+obj.add());
	System.out.println("Subtraction is "+obj.sub());
	if(obj.divide()==0){
	System.out.println("Division is Infinity");
	}
	else
	System.out.println("Division is "+obj.divide());
        System.out.println("Multiplication is "+obj.multiply());
}}

class Calculate{
	
	double x,y;
	Calculate(double a,double b){
	x=a;
	y=b;
	}
	public double add(){
	return x+y;
	}
	
	public double sub(){
	return x-y;
	}
	public double divide(){
	if(y==0){
	return 0;
	}
	return x/y;
	}
	public double multiply(){
	return x*y;
}}

