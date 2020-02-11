class parent{
void view()
{
System.out.println("parent class method");
}
}
class child extends parent {
void view()
{
System.out.println("child class method");
}
public static void main(String[] args)
{
parent ob=new parent();
ob.view();
parent ob1=new child();
ob1.view();
}
}