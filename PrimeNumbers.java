import java.util.*;
public class PrimeNumbers
{
	public static void main(String args[])
	{
		int n;
		System.out.print("Enter the value of n = ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		boolean arr[]=new boolean[n+1];
		for(int i=0;i<n+1;i++)
		arr[i]=true;//first suppose all are prime
		arr[0]=arr[1]=false;//they can not be prime
		for(int i=2;i<n+1;i++)
		{
			if(arr[i]==true)
			for(int j=2;j*i<n+1;j++)
			{
			arr[j*i]=false;	
				
			}
		}
		System.out.print("prime number upto n is = ");
		for(int i=0;i<n+1;i++)
			if(arr[i])
			{System.out.print(i+" ");
				
			}
	}

}
