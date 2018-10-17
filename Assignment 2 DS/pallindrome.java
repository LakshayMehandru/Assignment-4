import java.util.Scanner;
class pal
{
  public static void main(String[] args)
  {
    String str;
    Scanner s1 = new Scanner(System.in);
    str = s1.nextLine();
    int len = str.length();
    String tempstr = "";
    for(int i = len-1 ; i >= 0 ; i--)
    {
      tempstr += str.charAt(i);
    }
    if(str.equals(tempstr))
    {
      System.out.println("Palindrome");
    }
    else
    {
      System.out.println("Not Palindrome");
    }

  }
}