import java.util.Scanner;
public class PI	 {
    public static void main(String args[])
    {
        int a,b,x,y,z;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of x");
        x=input.nextInt();
        System.out.println("Eneter the value of y");
        y=input.nextInt();
        System.out.println("Enter the value of z");
        z=input.nextInt();
        a=Operator(x,y);
        b=Operator(z);
        if(a==b)
        System.out.println("The values of x and y that are satisfying the equation are "+x+" and "+y);
        else
            System.out.println("No X and Y exist");
    }



public static int Operator(int x, int y)
{
    int ans;
    ans=(x*x)+(y*y);
    return ans;
}
public static int Operator(int z)
{

    int ans;
    ans=(z*z);
    return ans;
}}