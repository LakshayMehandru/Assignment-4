import java.io.*;
class ab
{
public static void main(String args[])
{
try
{
sp f=new sp("w.txt");
pp p=new pp("h.txt");
String str;
str=f.getAbsolutePath();
p.write(str);
p.close();
System.out.println("complete");
}

catch(IOException e)
{
e.printStackTrace();
}
}
}

