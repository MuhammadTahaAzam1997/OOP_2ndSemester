
    class EmpRec{

    
    int id;
String name;
}
class Designation extends EmpRec{
    int a,s,b; String d;
        
    
    
    void Manager(int sal, int bonus, String des,int age, int id, String name ){
    s=sal;
    b=bonus;
    d=des;
    a=age;
    this.id=id;
    this.name=name;
    
    
        
    }
    void AssMang(int sal, int bonus, String des,int id,String name, int age ){
    s=sal;
    b=bonus;
    d=des;
    a=age;
    this.name=name;
    this.id=id;
   
    }
    void SV(int sal, String des,int id,String name, int age ){
    s=sal;
    d=des;
    a=age;
    this.name=name;
    this.id=id;
    }
    void S(int sal,int id, String des, String name, int age ){
    s=sal;
    a=age;
    d=des;
    this.name=name;
    this.id=id;
   
        
    }
void disp(){
System.out.println("Name: "+name);
        System.out.println("Id Number: "+id);
        System.out.println("age: "+age);
        System.out.println("Designation: "+des);
        System.out.println("Salary: "+sal);
        System.out.println("Bonus: "+bonus);
        System.out.println();
    }
void display(){
System.out.println("Name: "+name);
        System.out.println("Id Number: "+id);
        System.out.println("age: "+age);
        System.out.println("Designation: "+des);
        System.out.println("Salary: "+sal);
}
}
    class Taha1{
    public static void main(String[] args) {
    
        
    Designation obj=new Designation();
        System.out.println("Here is the employeer record");
    obj.Manager(500000, 10000, "Manager", 25, 101, "Muhammad Taha Azam");
obj.disp();

    obj.AssMang(50000, 10000, "Assistant Manager", 102, "Aimen", 25);
obj.disp();

    obj.SV(5000, "Supervisior", 103, "MAHEEN", 100);
obj.display();

    obj.S(2000, 104, "Security Guard", "Alina", 200);
obj.display();    
   
    
    }
    
}
