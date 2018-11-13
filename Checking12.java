import java.util.Scanner;
class Checking12{
public static void main(String args[]){

Scanner obj=new Scanner(System.in);
        String cid[]=new String[150];
        String cname[]=new String[150];
        double amount[]=new double[150];
System.out.println("Enter number of clients");	
int noofclient=obj.nextInt();        int i=0;
        for(i=0;i<noofclient;i++){
        cid[i]=obj.nextLine();
        }
        
        System.out.println("CLIENT ID \t\t\t\t\t\t\t\t Client Name \t\t\t\t\t\t\t\t Amount");
        System.out.println(cid[i]+" \t\t\t\t\t\t\t\t  "+cname);
        

    }
        for(i=0;i<noofclient;i++){
        cid[i]=obj.nextLine();
        }
        
        System.out.println("CLIENT ID \t\t\t\t\t\t\t\t Client Name \t\t\t\t\t\t\t\t Amount");
        System.out.println(cid[i]+" \t\t\t\t\t\t\t\t  "+cname);

    
}
