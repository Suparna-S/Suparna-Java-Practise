class Parents{}
class Child1 extends Parents{}
class Child2 extends Parents{}
class InstanceOfDemo
{
public static void main(String[] args)
{
Parents p= new Parents();
Child1 c1=new Child1();
Child2 c2=new Child2();
System.out.println(c1 instanceof Parents);
System.out.println(c2 instanceof Parents);
System.out.println(p instanceof Child1);
System.out.println(p instanceof Child2);
p=c1;
System.out.println(p instanceof Child1);
System.out.println(p instanceof Child2);
p=c2;
System.out.println(p instanceof Child1);
System.out.println(p instanceof Child2);
}
}