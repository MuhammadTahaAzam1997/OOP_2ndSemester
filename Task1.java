
class Task1{
	public static void main(String args[]){
	int a[]=new int[10];
	
	for(int i=0;i<a.length;i++)
	a[i]=(int)(Math.random()*100);

	for(int i=0;i<a.length-1;i++){
	for(int j=0;j<a.length-(i+1);j++){
	if(a[j]>a[j+1]){
	
	int temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
	  
	}}}


	System.out.println("\nAfter bubble sort :- ");
	for(int i=0;i<a.length;i++)
	System.out.print(a[i]+" ");
	
 }
}