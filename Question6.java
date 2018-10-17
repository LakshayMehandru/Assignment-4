class Array
{
	public static void main(String[] args)
	{
		int [] a = new int[]{1,1,1,1,0,0,1,0};
		int temp;
		for(int i=0;i<8-1;i++)
		{
			for(int j=0;j<8-i-1;j++)
			{
			if(a[j]>a[j+1])
			{
			    temp=a[j+1];
            	a[j+1]=a[j];
            	a[j]=temp;
			}
            
            }     
		}
		for(int i=0;i<8;i++)
		{
			System.out.print(a[i]);
		}
	}
}