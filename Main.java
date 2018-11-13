class Test{
int a,b,c;
void getdata(int x,int y)
{
a=x;
b=y;

}
void add(){
c=a+b;

System.out.println("the answer is  "+c);
}
}

class Main
{
public static void  main(String args[]){
Test obj= new Test();
obj.getdata(100,200);
obj.add();
}
	}