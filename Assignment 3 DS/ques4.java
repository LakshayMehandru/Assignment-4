public class a
{

static int power(int x,int y)
{
if(y==0)
{
return 1;
}
else if(y%2==0)
{
return power(x,y/2)*power(x,y/2);
}
else
{
return x*power(x,y/2)*power(x,y/2);
}
}

public static void main(String args[])
{
int x=2;
int y=4;
System.out.println("%d",power(x,y));
}

}
