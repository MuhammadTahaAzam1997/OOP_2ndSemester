class Tah{
double a,b,c;
Tah(double x,double y,double z){
a=x;
b=y;
c=z;
}
double volume(){
return a*b*c;
}
}

class Ta{
public static void main(String args[]){

Tah obj=new Tah(10,15,32);
Tah obj1=new Tah(0,1);
Tah obj2=new Tah();

double vol;

vol=obj.volume();
vol=obj1.volume();
vol=obj2.volume();
System.out.println(vol);
}
	}