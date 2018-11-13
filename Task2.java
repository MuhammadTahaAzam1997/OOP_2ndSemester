
class Task2{
	public static void main(String args[]){
	int a[]=new int[10];
	int max=0, min=100;

	for(int i=0;i<a.length;i++)
	a[i]=(int)(Math.random()*100);
	
	for(int i=0;i<a.length;i++){
	if(a[i]>max)
	max=a[i];
	}
	
	for(int i=0;i<a.length;i++){
	if(a[i]<min)
	min=a[i];
	}
	
	
	System.out.println("\nMax value is : "+max);
	System.out.println("Min value is : "+min);
	
	
 }
}