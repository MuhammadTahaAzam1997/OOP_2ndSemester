import javax.swing.*;
class Student{
int id;
int[] marks=new int[3];
String name;
Student(int idd,String s,int[] m)
{
id=idd;
name=s;
marks=m;
}
void calculate()
{
int sum=0;
for(int i=0;i<marks.length;i++)
sum+=marks[i];
JOptionPane.showMessageDialog(null,"Name: "+name+"\nID: "+id+"\nTotal marks: "+sum+"\nAverage: "+sum/3);
}}
class Mohsin1
{
public static void main(String[]args)
{
String[] name={"Syed","Mohsin","Ali"};
int[][] marks={{30,40,30},{50,50,30},{40,40,30}};
int id[]={100,101,102};
Student[] std=new Student[3];
for(int i=0;i<std.length;i++)
{
std[i]=new Student(id[i],name[i],marks[i]);
std[i].calculate();
}}}