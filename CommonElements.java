import java.util.Scanner;
import java.util.*;
 class CommonElements {
    public static void main(String args[])
    {
 Scanner sc=new Scanner(System.in);
int n1,n2,count=0,i,j,k,m;
System.out.println("first input size from user");
n1=sc.nextInt();
int a[]=new int[n1];
for(i=0;i<n1;i++){
 a[i]=sc.nextInt();
}
System.out.println("second input size from user");
n2=sc.nextInt();
int b[]=new int[n2];
for(j=0;j<n2;j++){
 b[j]=sc.nextInt();
}
for( i=0;i<n1;i++){
for( j=0;j<n2;j++)
{
if(a[i]==b[j]){
count=count+2;
}
}
}
int c[]=new int[count];
for( i=0;i<n1;i++){
for( j=0;j<n2;j++)
{
if(a[i]==b[j]){
m=a[i];
for( k=0;k<count;k++){
if(a[k]==m||b[k]==m){
c[k]=m;
}
}
}
}
}
System.out.print(count+"( ");
for( k=0;k<count;k++){
System.out.print(c[k]+" ");
}
System.out.print(")");

}}