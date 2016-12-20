package prapul;

public class AndroidSession2_assignment2 {
	public static void main(String[] args) {
		int i,j;
		for (i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print("*");
				else if (i==1 && j==5)
					System.out.print("*");
				else if	(i==5 && j==1)
					System.out.print("*");
				else if (i==2 && j==4)
					System.out.print("*");
				else if	(i==4 && j==2)
					System.out.print("*");
				else 
					System.out.print(" ");
					
			}
			System.out.println();
		}
	}

}
