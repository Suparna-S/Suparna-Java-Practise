import java.util.Scanner;
class PosNegNum
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter numbers: ");
int n=sc.nextInt();
int a[]= new int[10];
int sum=0, count=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[i]<0)
{
count++;
sum=sum+a[i];
}}
System.out.println("Number of positive nos.: " + count);
System.out.println("Sum of positive numbers: " + sum);
}
}
