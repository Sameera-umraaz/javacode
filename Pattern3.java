package basiclogical;

public class Pattern3 
{
	public static void main(String[] args) {
		int i,j,row=4;
		for(i=0;i<=row;i++)
		{
			for(j=row;j>=0;j--)
			{
				if(j>i)
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
		    }
			System.out.println();	
		}
	}

}
