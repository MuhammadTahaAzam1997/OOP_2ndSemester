class add
{
public static void main(String args[])
{
int i,j;
int a[][]={{10,20,30},{10,20,30}};
int b[][]={{10,40,30},{10,40,30}};

for(i=0;i<a.length;i++)
{
for(j=0;j<a.length;j++)
{
int c[][];
c[i][j]=a[i][j]+b[i][j];
System.out.println(c[i][j]);
}}}}