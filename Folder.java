/* Write a program which creates a String “C:\IBM\DB2\PROGRAM\DB2COPY1.EXE”. 
It parses the string with the delimiter as ‘\’ and displays the String in the
 following format.
Drive: c:\
Folders: IBM || DB2 || PROGRAM 
File: DB2COPY1.EXE

Hint:  Use String Builder for concatenating the folder names with |
*/



import java.lang.*;
import java.util.*;

class Folder
{
public static void main(String[] args)
{
String s = new String("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
String strPiped =s.replace("\\"," || ");

String drive=strPiped.substring(0,3);
String folder=strPiped.substring(6,28);
String file=strPiped.substring(31,43);
System.out.println("\n\nDrive: "+drive);
System.out.println("Folder: "+folder);
System.out.println("File: "+file);
}
}
