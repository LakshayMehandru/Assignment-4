import java.util.Scanner;
class Array
{
	public static void main(String[] args)
	{
		int [] a = new int[]{1,4,6,7,8,9,10};
		int flag=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int N =s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]==N)
			{
			  flag=1;
			}
           
		}
		if(flag==1)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("not found");
		}
	}
}