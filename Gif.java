class Gift{
double width,height,depth;
void setdata(double w,double h,double d){
width=w;
height=h;
depth=d;
}
double volume(){
 return width*height*depth;
}
}

class Gif{
public static void main(String args[]){
Gift a=new Gift();
Gift b=new Gift();
double v;

a.setdata(2,5,10);
v=a.volume();
System.out.println(v);
b.setdata(4,10,20);
v=b.volume();
System.out.println(v);
}
}