/* Create a class Employee with the following instance variables.

Instance variables 	Data type
employeeId	long
employeeName	String
employee Address	String
employee Phone	Long
basicSalary	double
specialAllowance	double  default value- 250.80
Hra	double,default value- 1000.50
*/

import java.util.*;
class Inheritence1{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("enter ID");
int id=sc.nextInt();
System.out.println("enter Name");
String name=sc.next();
System.out.println("enter Address");
String address=sc.next();
System.out.println("enter Phone number");
long number=sc.nextLong();
System.out.println("enter basic salary");
double basic =sc.nextDouble();
double specialAllowance=250.80;
System.out.println("SpecialAllowance:  "+specialAllowance);
double hra=1000.50;

System.out.println("HRA: "+hra);
}
}
