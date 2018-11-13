class Bik{
int a,b,c;
void setdata(int x,int y,int z){
a=x;
b=y;
c=z;
}
double volume(){
return a*b*c;
}
}
class Bike{
public static void main(String args[]){
Bik a=new Bik();
Bik b=new Bik();

double v,v1;
a.setdata(5,6,7);
v=a.volume();
b.setdata(6,7,8);
v1=b.volume();
System.out.println(v);
System.out.println(v1);
}
}