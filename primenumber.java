package basiclogical;

public class primenumber 
{
	public static void test(int num) 
	{
		int count=0;
		for(int i=2;i<num;i++) 
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("prime");
		}
		else 
		{
			System.out.println("not prime");
		}
	}
	public static void main(String[] args)
	{
		test(10);
		test(7);
	}
}
