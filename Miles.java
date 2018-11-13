class Miles
{
public static void main(String args[])
{
double ppg=80,amount=800;
int ini=10;
int fin=18;
double numofgallons,mpg;
int miles=fin-ini;
numofgallons=amount/ppg;
mpg=miles/numofgallons;
System.out.println("total miles="+miles);
System.out.println("the number of gallons of gas used="+numofgallons);
System.out.println("the miles per gallon that the car achieved="+mpg);
}
}
