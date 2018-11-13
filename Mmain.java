class Taha extends Thread{
public void run(){
for(int i=0;i<5;i++){
System.out.println("Taha");
}
}
}
class Mmain{
public static void main(String ar[]){
Taha o=new Taha();
o.start();
}
}