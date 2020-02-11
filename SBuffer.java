import java.lang.String;
class SBuffer
{
public static void main(String args[])
{
StringBuffer s1=new StringBuffer("This is StringBuffer");
s1.append(" -This is a sample program");
System.out.println(s1);
 s1.insert(21,"Object");
s1.replace(14,20,"Builder");
System.out.println(s1);
s1.replace(14,20,"Builder");
System.out.println(s1);
 s1.reverse();
System.out.println(s1);
}
}