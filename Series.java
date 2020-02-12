//Serises  Write a program to generate the following series:

            //            1, -2, 3, -4, 5, -6, … N

import java.util.*;
public class Series{
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int n=sc.nextInt();
System.out.println("Series is...");
for(int i=1;i<=n;i++){

if(i%2==0){
System.out.print(" -"+i);
}
else
{
System.out.print(" "+i);
}
}
}}

