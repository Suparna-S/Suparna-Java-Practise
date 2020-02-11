import java.util.Scanner;
class printseries
{
public static void main(String args[])
{
int i,j,k,count=0,f=0;
System.out.println("series:");
System.out.println("2");
for(i=5;i<100;i++)
{
for(j=2;j<i;j++)
{
if (i%j==0)
{
f=0;
break;
}
else{
f=1;
}
}
if(f==1)
{
count++;
if(count%2!=0)
{System.out.println(i);
}
}
}
}}
