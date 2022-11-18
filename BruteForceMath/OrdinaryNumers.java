import java.util.*;
public class OrdinaryNumers
{
	public static int reverse(int n)
	{
		int temp=0;
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			temp=(temp*10)+rem;
		}
		return temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0)
		{
			for(int i=1;i<=9;i++)
			{
				for(int i=1)
			}
		}
	
	}
}