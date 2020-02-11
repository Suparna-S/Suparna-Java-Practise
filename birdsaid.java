import java.util.Scanner;
class birdsaid
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("The bird said: " );
int a=sc.nextInt();
int i=a%10;
int j=a/10;
int sum=(i+j);
System.out.println("Patrick and Johnny must go in path: "+sum+ "  to find Alice");
}
}