class Taha
{
int a,b;

void getdata(int x, int y){
a=x;
b=y;
}
void add(){

int c=a+b;
System.out.println(c);
}
}

class Azam
{
int d,e;
void setdata(int m,int n){
d=m;
e=n;
}
void multiply(){

int f=d*e;
System.out.println(f);
}
}

class TahaAzam{
public static void main(String args[]){

Taha obj=new Taha();
Azam obj1=new Azam();

obj.getdata(56,45);
obj.add();

obj1.setdata(12,12);
obj1.multiply();
}
	}


