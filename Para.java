class Pa{
double a,b,c;
Pa(double width,double height,double bredth){

this.a=width;
this.b=height;
this.c=bredth;
}
double volume(){
return a*b*c;
}
}
class Para{
public static void main(String args[]){

Pa a=new Pa(5,6,7);
Pa b=new Pa(6,7,8);

double v,v1;
v=a.volume();
v1=b.volume();


System.out.println(v);
System.out.println(v1);
}
	}