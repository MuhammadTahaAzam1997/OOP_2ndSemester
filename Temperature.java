import java.lang.Math;
class Temperature{
	public static void main(String args[]){
	double temp[]=new double[4];
	double avg, sum=0;
	System.out.println("Temperature Values of four cities");
	for(int i=0;i<temp.length;i++){
	do{
	temp[i]=Math.random();	
	}while(temp[i]<=10||temp[i]>=35);
	sum += temp[i];
	System.out.printf("%.2f\n",temp[i]);
	}
	System.out.printf("Average temperature is %.2f ",sum/4);
	
 }
}