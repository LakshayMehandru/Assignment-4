import java.util.*;
class 2d
{
  public static void main(String[] args) 
  {
    Scanner s1=new Scanner(System.in);
    int r,c,n,i,j=0,max=0,k=-1,n1;
    System.out.println("enter the size of rows and cols of 2d array");
    r=s1.nextInt();
    c=s1.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("enter elements of array");
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        arr[i][j]=s1.nextInt();
      }
    }
    for(i=0;i<r;i++)
    {
      if(k==-1)
      {
        for(k=0;k<c;k++)
        {
          System.out.print(" "+arr[i][k]);
        }
      }
      else
      {
        for(k=c-1;k>=0;k--)
        {
          System.out.print(" "+arr[i][k]);
        }
      }
      
    }
    
  }
}