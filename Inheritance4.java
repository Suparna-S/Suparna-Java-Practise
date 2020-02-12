/* Create the sub classes Manager and Trainee with base class Employee. Create overloaded constructors which takes the below parameters and initializes them to their respective variables in the super class.

Constructor parameter	Instance Variable
id	employeeId
Name	employeeName
address	employeeAddress
phone	employeePhone
salary	basicSalary
*/


import java.util.*;
class Base{
int id;
String name,address;
long number;
double basic;
Base(int id,String name,String address,long number,double basic){
this.id=id;
this.name=name;
this.address=address;
this.number=number;
this.basic=basic;
}

class Manager extends Base{
Manager()
{
}
}
class Trainee extends Base{
Trainee()
{
}
}
class Inher4{
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
System.out.println("Values"+Base(id,name,address,number,basic));
}
}
}
