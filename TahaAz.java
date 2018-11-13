class Gift{
double width,height,depth;
void setdata(int w, int h,int d){
width=w;
height=h;
depth=d;
}
void volume(){
 return w*h*d;
System.out.println(
}
}
class Gif{
public static void main(String args[]){
Gift a=new Gift();
Gift b=new Gift();
double v;

v=a.setdata(2,5,10);
v=a.volume();
System.out.println(v);
v=b.setdata(4,10,20);
v=b.volume();
System.out.println(v);
}
