import java.util.Scanner;

class Functions1 
{
public static void main(String[] args)
{
Scanner with = new Scanner(System.in);
System.out.println("++++SIMPLE CALCULATOR++++");

System.out.println("\n1.ADDITION");

System.out.println("2.SUBTRACTION");

System.out.println("3.DIVISION");

System.out.println("4.MULTIPLICATION");

System.out.println("\nWhat do u like");
int choice = with.nextInt();
System.out.println();

if(choice==1){
   addition();
}
else if(choice==2){
   subtraction();
}
else if(choice==3){
  division();
}
else if(choice==4){
  multiplication();
}
System.out.println();
with.close();
}

public static void addition()
{
int num1,num2;
Scanner with =new Scanner(System.in);

System.out.println("Addition");

System.out.println("\nEnter the first number");
num1 = with.nextInt();

System.out.println("Enter the second number");

num2 = with.nextInt();
with.close();
System.out.println("SUM= " +(num1-num2));
}
 

public static void subtraction()
{
int num1,num2;
Scanner with =new Scanner(System.in);

System.out.println("Subtraction");

System.out.println("\nEnter the first number");
num1 = with.nextInt();

System.out.println("Enter the second number");

num2 = with.nextInt();
with.close();
System.out.println("SUb= " +(num1-num2));
}

public static void division()
{
int num1,num2;
Scanner with =new Scanner(System.in);

System.out.println("Division");

System.out.println("\nEnter the first number");
num1 = with.nextInt();

System.out.println("Enter the second number");

num2 = with.nextInt();
with.close();
System.out.println("div= " +(num1/num2));
}

public static void multiplication()
{
int num1,num2;
Scanner with =new Scanner(System.in);

System.out.println("Multiplication");

System.out.println("\nEnter the first number");
num1 = with.nextInt();

System.out.println("Enter the second number");

num2 = with.nextInt();

with.close();
System.out.println("mul= " +(num1*num2));
}
}