class Box
{
private int length,breadth,height;
public void setdimension(int l, int b, int h);
{
length=l; breadth=b; height=h;}
public void showdimension()
{
System.out.println("l"+length);
System.out.println("b"+breadth);
System.out.println("h"+height);}}

class example{
public static void main(){
Box smallbox= new Box();
smallbox.setdimension(12,10,5);
smallbox.showdimension();
smallbox= new Box();
smallbox.showdimension();
}}