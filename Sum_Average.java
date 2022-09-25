package basiclogical;

public class Sum_Average {
	public static void test(int n,int m)
	{
		int	sum=m+n;
		System.out.println("the sum is-->" + sum);
		double avg=sum/2;
		System.out.println("the avg is-->" +avg);
	}
	public static void main(String[] args) {
		test(10,20);
	}
}
