import java.util.*;
public class FactorialOfNonNegNum{
 public static void main(String[] args) {
System.out.println("Enter number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fact=1;
if(n>0)
{
for(int i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("factorial of the given number: "+fact);
}
}
}
