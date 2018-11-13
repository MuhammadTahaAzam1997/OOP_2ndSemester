class Mob{
int x,y,z;
void setdata(int a,int b,int c){
x=a;
y=b;
z=c;
}
void volume(){
int v=x*y*z;
System.out.println(v);
}}

class Mobile{
public static void main(String args[]){

Mob a=new Mob();
Mob b=new Mob();

a.setdata(5,6,7);
a.volume();

b.setdata(6,7,8);
b.volume();
}
}