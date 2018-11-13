class Ch{

double a,b,c;

Ch(){

double width,height,depth;
width=10;
height=20;
depth=30;
a=width;
b=height;
c=depth; 
}
double volume(){
return a*b*c;
}
}
class Check{
public static void main(String args[]){

Ch a=new Ch();
Ch b=new Ch();

double v,v1;

v=a.volume();
v1=b.volume();

System.out.println(v);
System.out.println(v1);
}
}