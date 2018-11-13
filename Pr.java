class P{
double a,b,c;
 P(double width,double height, double depth){
this.a=width;
this.b=height;
this.c=depth;
}

double volume(){
return a*b*c;
}
}
class Pr{
public static void main(String args[]){

P a=new P(5,10,16);
P b=new P(4,5,6);

double v,v1;

v=a.volume();
v1=b.volume();

System.out.println(v);
System.out.println(v1);
}
}