class Box{
int x,y,z;

void getdata(int w,int h, int b){
x=w;
y=h;
z=b;
}

void volume(){
int v=x*y*z;
System.out.println(v);
}
}

class BoxDe{
public static void main(String args[]){

Box mybox=new Box();
mybox.getdata(4,5,6);
mybox.volume();
}
	}