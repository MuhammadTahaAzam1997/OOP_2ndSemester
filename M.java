import java.util.Scanner;
class M1
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int A[]=new int[8];
int d;
for(int x=0;x<=7;x++)
{
System.out.print("the numbers are:");
A[x]=s.nextInt();
}
for(int x=0;x<=6;x++)
{
for(int y=x+1;y<=7;y++)
{
if(A[x]<A[y])
{
d=A[x];
A[x]=A[y];
A[y]=d;
}
}
}
System.out.println("after sorting the numbers are:");
for(int x=0;x<8;x++)
{
System.out.println(A[x]);
}
}
}
