import java.util.Scanner;
class Box{

double width;
double height;
double depth;
}
class BoxDemo{

public static void main(String args[])
{
Scanner obj = new Scanner(System.in);

Box mybox= new Box();

double vol;
System.out.println("enter width");
mybox.width=obj.nextDouble();
System.out.println("enter depth");
mybox.depth=obj.nextDouble();
System.out.println("enter height");
mybox.height=obj.nextDouble();

vol=mybox.width*mybox.depth*mybox.height;

System.out.println("volume of box is\t\t" +vol);
}
} 

