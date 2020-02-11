import java.util.Scanner;
class discount
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int prod_cost1=sc.nextInt();
int prod_cost2=sc.nextInt();
int prod_cost3=sc.nextInt();
int pp=0;
if(prod_cost1<prod_cost2)
{ if(prod_cost1<prod_cost3)
 { pp=prod_cost1;
}
}
else if(prod_cost2<prod_cost3)
{ pp=prod_cost2; }
else
 {
  pp=prod_cost3;
}
System.out.println("least product value"+pp);
int total=prod_cost1+prod_cost2+prod_cost3;
double offer1=total-(total+0.2);
int offer2=total-pp;
System.out.println("With discount: " + offer1 );
System.out.println("With discount2: " + offer2 );
if(offer1>offer2)
{ System.out.println("Go for offer1"); }
  else
  { System.out.println("Go for offer2"); }
}
}