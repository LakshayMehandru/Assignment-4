import java.util.Scanner;
class Evennumber
{
public static void main(String[] args)
{
int even=0;
Scanner s = new Scanner(System.in);
System.out.println("Enter a number");
int N = s.nextInt();
for(int i=1;i<=N;i++)
{
if(i%2==0)
{
 even = i;
System.out.println(even);
}
}
}
}