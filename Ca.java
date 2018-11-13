import java.util.Scanner;
class Ca{
public static void main(String ar[]){
Scanner obj=new Scanner(System.in);
System.out.println("Enter name");
String name=obj.nextLine();
int i=name.length();
System.out.println("Your name has "+i+" letter(s).");
}}