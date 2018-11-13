class Gift{
double x,y,z;

void getdata(double w,double h,double d){
x=w;
y=h;
z=d;
}
void volume(){
double v=x*y*z;
System.out.println(v);
}}
class Gi{
public static void main(String args[]){

Gift obj=new Gift();
Gift obj1=new Gift();


obj.getdata(4,5,6);
obj.volume();


obj1.getdata(5,6,7);
obj1.volume();

}
	}