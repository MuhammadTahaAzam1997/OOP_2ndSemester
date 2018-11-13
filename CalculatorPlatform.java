
package calculatorplatform;

/**
 *
 * @author Muhammad Taha Azam
 */
class Taha{
   int a,b,c;
   void setdata(int x,int y,int z){
       a=x;
       b=y;
       c=z;
       
   }
   void area(){
       int d=(a*b*c)/2;
       System.out.println();
   }
}
public class CalculatorPlatform {
    public static void main(String args[]){
   Taha obj=new Taha();
   obj.setdata(5, 10, 100);
    obj.area();
    
        }
               
      

        
        
    }
    

