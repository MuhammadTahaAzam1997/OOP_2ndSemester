class Con{

int a,b;
Con(){
System.out.println("defaoult constructor");
a=10;
a=20;
}


void Disp(){

System.out.println("The value of A is: "+a);
System.out.println("The value of B is: "+b);
}
}
class Ty{
public static void main(String args[]){

Con obj=new Con();
obj.Disp();
}
}
