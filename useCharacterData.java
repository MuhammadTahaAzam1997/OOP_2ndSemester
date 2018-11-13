import javax.swing.*;
class CharacterData{
char []array=new char[5];
CharacterData(char []array1){
array=array1;
}
public void CharArr(){
char ch,ch1;
String str="",nstr;
boolean res=true;
for(int i=0;i<array.length;++i)
{
ch=array[i];
if(Character.isUpperCase(ch)){
ch1=Character.toLowerCase(ch);
nstr=""+ch1;
str=str+nstr;}
else{
ch1=Character.toUpperCase(ch);
nstr=""+ch1;
str=str+nstr;
}
}
JOptionPane.showMessageDialog(null,""+str);
}}
class useCharacterData{
public static void main(String[]args){
char []array={'a','B','C','d'};
CharacterData obj=new CharacterData(array);
obj.CharArr();
}}