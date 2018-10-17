import java.util.Scanner;
class toggle
{
  public static void main(String[] args)
  {
    String str;
    int temp;
    Scanner s1 = new Scanner(System.in);
    str = s1.nextLine();
    int len = str.length();
    for(int i = 0 ; i < len ; i++)
    {
      if(str.charAt(i) != ' ')
      {
       if(str.charAt(i) >='a' && str.charAt(i) <='z')
       {
           temp = (int)str.charAt(i);
           temp -=32;
           System.out.print((char)temp);
       }
       else
       {
           temp = (int)str.charAt(i);
           temp +=32;
           System.out.print((char)temp);
       }
      }
      else System.out.print(" ");
    }
    
  }
}
