import java.util.Scanner;

class Compare{
public static void main(String args[]){

Scanner obj= new Scanner(System.in);

int num1,num2;

System.out.println("Enter first number");

num1= obj.nextInt();

System.out.println("Enter second number");
num2= obj.nextInt();

if(num1==num2)
System.out.printf("%d\t==%d\t\n",num1,num2);

if(num1!=num2)
System.out.printf("%d\t!=%d\t\n",num1,num2);

if(num1<=num2)
System.out.printf("%d\t<=%d\t\n",num1,num2);

if(num1>=num2)
System.out.printf("%d\t>=%d\t\n",num1,num2);

if(num1>num2)
System.out.printf("%d\t>%d\t\n",num1,num2);

if(num1<num2)
System.out.printf("%d\t<%d\t\n\n",num1,num2);

}
}