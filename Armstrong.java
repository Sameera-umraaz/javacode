package basiclogical;
import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int n1=n;
		int n2=n;
		int count=0,sum=0;

		
		while(n1>0)
		{
			count++;
			n1=n1/10;//153/10=15
		}
		System.out.println("the count is-->"+count);
		
		while(n>0)
		{
			int rem=n%10;
			
			int power=1;
			for(int i=0;i<count;i++)
			{
				power=power*rem;
			}
			sum=sum+power;
			n=n/10;
		}
		if(sum==n2)
		{
			System.out.println("It is an ArmStrong number");
		}
		else
		{
			System.out.println("It is not an Armstrong number");
		}
	}
}
