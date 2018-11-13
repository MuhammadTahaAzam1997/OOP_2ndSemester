import java.util.Scanner;

class creditDetails
{
	String Name;
	int limit;
	String accountID;
	int sum=0;
	int initialBalance;
	int noitems;
	
	int amountSpent(int noitems)
	{
	Scanner sc=new Scanner(System.in);
	int[] price=new int[noitems];
	for(int x=0;x<price.length;x++)
		{
		System.out.println("ENTER PRICE OF ITEM NO. "+(x+1));
		price[x]=sc.nextInt();
		sum=sum+price[x];
		}
	return sum;
	}
	
	int amountRemaining()
	{
		int rem=this.initialBalance-sum;
		return rem;
	}
	boolean checkCreditLimit()
	{
		if(this.amountSpent(noitems)>this.limit)
			{System.out.println("LIMIT EXCEEDED");
			return false;}
		else return true;
			
	}
}

class Q13{
	public static void main(String args[])
	{
		creditDetails Customer=new creditDetails();
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER NAME:\t");
		Customer.Name=scan.nextLine();
		System.out.println("ENTER ACCOUNT ID");
		Customer.accountID=scan.nextLine();
		System.out.println("ENTER INITIAL BALANCE");
		Customer.initialBalance=scan.nextInt();
		System.out.println("ENTER LIMIT ");
		Customer.limit=scan.nextInt();
		System.out.println("ENTER NO OF ITEMS PURCHASED");
		int noitems=scan.nextInt();
		int spent=Customer.amountSpent(noitems);

		if(Customer.checkCreditLimit())
		{
		int remain=Customer.amountRemaining();
		System.out.println("TOTAL AMOUNT SPENT IS:"+spent);
		System.out.println("TOTAL REMAINING AMOUNT IS: "+remain);}
	}
}
