import java.util.Scanner;
class Addition11{
public static void main(String args[])
{
Scanner input= new Scanner(System.in);
int n1,n2;
int sum;
System.out.println("Enter first five digit number");
n1= input.nextInt();
System.out.println("Enter second five digit number");
n2= input.nextInt();

sum=n1+n2;
System.out.printf("sum is %d%n ",sum);
}
}
