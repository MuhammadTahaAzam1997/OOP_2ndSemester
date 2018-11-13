import java.util.Scanner;
class Q9{
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.print("Enter a Decimal No. : ");
	int num=in.nextInt();
	String str = Integer.toHexString(num);
	System.out.print("The Hexa Decimal value is "+str);
 }
}