import java.util.Scanner;

class Pr{

double width;
double height;
double depth;

}
class PrDemo{
public static void main(String args[]){
Scanner obj=new Scanner(System.in);

Pr Box1= new Pr();
Pr Box2= new Pr();

double volume1, volume2;
System.out.println("insert the width of box");
Box1.width=obj.nextDouble();
System.out.println("insert the depth of box");
Box1.depth=obj.nextDouble();
System.out.println("insert the height of box");
Box1.height=obj.nextDouble();

System.out.println("insert the width of box");
Box2.width=obj.nextDouble();
System.out.println("insert the height of box");
Box2.height=obj.nextDouble();
System.out.println("insert the depth of box");
Box2.depth=obj.nextDouble();

volume1=Box1.width*Box1.depth*Box1.height;

volume2=Box2.width*Box2.depth*Box2.height;

System.out.println("The volume of Box1 is "+volume1);

System.out.println("The volume of Box2 is "+volume2);

}
	}