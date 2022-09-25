package basiclogical;
import java.util.Scanner;

public class Sum_Average 
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the first value");
	int n=s.nextInt();
	System.out.println("enter second value");
	int m=s.nextInt();
	s.close();
	int sum=m+n;
	System.out.println("the sum is-->"+sum);
	double avg=sum/2;
	System.out.println("the avg is-->"+avg);
	}
}
