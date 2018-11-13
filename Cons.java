class C{
double width,bredth,height;

C(){
width=10;
bredth=20;
height=30;
}

double volume(){
return width*bredth*height;
}

}
class Cons{
public static void main(String args[]){

C a=new C();
C b=new C();

double v,v1;

v=a.volume();
v1=b.volume();

System.out.println(v);
System.out.println(v1);
}
	
}