class PointDemo{
	public static void main(String args[]){
	double x, y; boolean i;
	Point pointobj=new Point(17.41,47.62);
	
	System.out.println("Passing value of x by constructor is 17.41");
	
	System.out.println("Passing value of y by constructor y is 47.62");
	x=pointobj.getX();
	System.out.println("xcord value is "+x);
	y=pointobj.getY();
	System.out.println("ycord value is "+y);
	i=pointobj.isEqual(x,y);
	System.out.println(i);
}}
class Point{

	private double xcord,ycord;
	public Point(double a, double b){
	xcord=a;
	ycord=b; }
	
	public void setX(double x){
	xcord=x;
	}
	public void setY(double y){
	ycord=y;
	}
	public double getX(){
	return xcord;
	}
	public double getY(){
	return ycord;
	}
	public boolean isEqual(double x,double y){
	if(x==xcord&&y==ycord)
	return true;
	else return false;
}}
