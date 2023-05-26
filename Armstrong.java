import java.util.Scanner;
public class Armstrong
{
  public static void main(String args[])
  {
    int i,s,temp,r;
    Scanner num=new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int N=num.nextInt();
    int[] anArray=new int[5];
    System.out.println("Enter the elements of the array: ");
    for(i=0;i<N;i++)
    {
      anArray[i]=num.nextInt();
    }
    System.out.println("The list of Armstrong numbers in the given array are: ");
    for(i=0;i<N;i++)
    {
      temp=anArray[i];
      s=0;
      while(temp!=0)
      {
        r=temp%10;
        s=s+r*r*r;
        temp=temp/10;
      }
      if(s==anArray[i])
         System.out.println(anArray[i]+" ");
      else
         continue;
    }
  }
}