class ohm
{
public static void main(String args[])
{
double R1,R2,R3;
R1=5;
R2=5;
R3=5;
double RS,RP;

RS=R1+R2+R2;
System.out.println("The value of Resistance in series is:"+RS);
RP=1/(1/R1+1/R2+1/R3);
System.out.println("The value of Resistance in parallel is:"+RP);
}
}