class Sum
{
public static void main(String args[])
{
int a=23145,i,temp,b,c,d,f=0;
temp=a;
System.out.println("a="+23145);
for(i=1;i<5;i++)
{
b=temp%10;
temp=temp/10;
System.out.println(b);
c=temp%10;
System.out.println(c);
d=b*c;
System.out.println("d="+d);
f=f+d;
}
System.out.println(f);
}
}