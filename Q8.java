import java.util.Scanner;
class Q8{
	public static void main(String args[]){
	Scanner in=new Scanner(System.in);
	System.out.print("Enter a Hexa Decimal No. : ");
	String hexa=in.nextLine();
	int deci=Integer.parseInt(hexa,16);
	System.out.println("Decimal value is "+deci);
	}
}