import java.util.Scanner;
class Salary{
public static void main(String args[]){
Scanner obj= new Scanner(System.in);
int sal,b;
System.out.println("Enter your basic salary");
sal=obj.nextInt();
if(sal>10000);{
b=(sal*10)/100;
sal=sal+b;

}System.out.println("Your basic salary with bonus is "+ sal);
}
}