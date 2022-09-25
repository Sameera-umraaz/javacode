package basiclogical;

public class FibonnacciSeries 
{
	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		int n3;
		int count=10;
		System.out.println("the value of n1 is :"+ n1 +"\tthe value of n2 is:  " +n2);
		for(int i=2; i<count; i++)
		{
			n3=n1+n2;
			System.out.println(" " +n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
