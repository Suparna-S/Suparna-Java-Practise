import java.util.Scanner;
class largesquare
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int oneside= n/4;
int m=oneside*2;
int square=m*m;
System.out.println(square);
}
}