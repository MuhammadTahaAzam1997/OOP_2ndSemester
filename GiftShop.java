class Gift{

long depth;
long height;
long width;

}

class GiftShop{
public static void main(String args[]){

Gift mycar = new Gift();

long total;

mycar.depth=15000;
mycar.width=15000;
mycar.height=20000;

total= mycar.depth+mycar.height+mycar.width;

System.out.println("the total price of car is/t "+total);
}}