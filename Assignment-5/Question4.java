
class Test
{
	int r;
	static int count;
	static 
	{
		System.out.println("In static 1");
		count = 10;
	}
	static 
	{
		System.out.println("In static 2");
		System.out.println("In static 2 with count"+" "+count);
	}

	{
		System.out.println("In non-static 1");
		System.out.println("In non-static 1 with count ="+" "+count);
		r = 5;
	}
	 
	{
		System.out.println("In non-static 2");
		System.out.println("In non-static 2 with roll_no ="+" "+r);
	}
	Test()
	{
		System.out.println("In constructor");
	}
}
class Main_class
{
   static
    {
     	System.out.println("Inside static block of main class");
    }  
	public static void main(String[] args)
	{
     	System.out.println("Inside main class");
        Test t = new Test();
        Test t1 = new Test();
	}
}