import java.lang.String;
class WelcomeJavaWorld
{
public static void main(String args[])
{
String s1="Welcome to Java World";
String s2="Welcome";
String s3=" Let us learn!!";
char c1=s1.charAt(5);
System.out.println("Character at 5th position is: "+c1);
System.out.println("Comparing s1 and s2, the result is: "+s1.equalsIgnoreCase(s2));
String c2=s1.concat(s3);
System.out.println("Concatenated string is: "+c2);
System.out.println("Position of first occurrence of a is: "+c2.indexOf("a",1));
System.out.println("After replacing a with e, the result is: "+c2.replaceAll("a","e"));
System.out.println("Substring between 4th and 10th position is: "+c2.substring(4,11));
System.out.println("Lowercase of the string is: "+c2.toLowerCase());
}
}