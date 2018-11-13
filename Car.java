class Ca{
double width;
double height;
double depth;
}

class Car{
public static void main(String args[]){

Ca a=new Ca();
Ca b=new Ca();

a.width=5;
a.height=6;
a.depth=7;

b.width=6;
b.height=7;
b.depth=8;

double v,v1;

v=a.width*a.depth*a.height;
v1=b.width*b.depth*b.height;

System.out.println(v);
System.out.println(v1);
}
	}