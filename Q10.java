import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) 
	{
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter string to Encrypt : ");
		String inp=in.nextLine();
		
		char[] ch=inp.toCharArray();
		int y[]=new int[ch.length];
		
		for(int i=0;i<ch.length;i++)
		{
			y[i]=(int)ch[i];
			y[i]+=3;
			System.out.print((char)y[i]);
		}
		
		System.out.println("\nDecrypted code is : ");
		for(int j=0;j<y.length;j++)
		{
			y[j]-=3;
			System.out.print((char)y[j]);
		}
	
	}
}

