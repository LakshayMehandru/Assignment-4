import java.util.*;
class i
{
  public static void main(String[] args) 
  {
    Scanner s1=new Scanner(System.in);
    int n,i,j,max=0,k=0,n1;
    System.out.println("enter the size of array 1");
    n=s1.nextInt();
    int arr[]=new int[n];
    System.out.println("enter elements of array 1");
    for(i=0;i<n;i++)
    {
      arr[i]=s1.nextInt();
    }
    System.out.println("enter the size of array 2");
    n1=s1.nextInt();
    int arr1[]=new int[n1];
    System.out.println("enter elements of array 2");
    for(i=0;i<n1;i++)
    {
      arr1[i]=s1.nextInt();
    }
    int arr2[]=new int[20];
for(i=0;i<n;i++)
    {
      for(j=0;j<n1;j++)
      {
        if((arr[i]==arr1[j])&&(arr[i]!=-1)&&(arr1[j]!=-1))
        {
          arr2[k]=arr[i];
          k++;
          
          arr[i]=-1;
          arr1[j]=-1;
        }
      }
    }

    for(i=0;i<k;i++)
    {
      for(j=0;j<k-i-1;j++)
      {
        if(arr2[j]>arr2[j+1])
        {
          arr2[j]=arr2[j]^arr2[j+1];
          arr2[j+1]=arr2[j]^arr2[j+1];
          arr2[j]=arr2[j]^arr2[j+1];
        }
      }
      
    }
    System.out.println("final array:");
    for(i=0;i<k;i++)
    {
      System.out.print(arr2[i]+" ");
    }
    
  }
}