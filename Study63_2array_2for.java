package Study0421;

import java.util.Scanner;

public class Study63_2array_2for 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int SU = 3;
		int DAN = 3;
		String name[][] = new String[DAN][SU];
		
		for(int i=0; i<DAN; i++)
		{
			for(int j=0; j<SU; j++)
			{
				System.out.print(i+1+"반사람"+(j+1)+"번학생 : ");
				name[i][j] = sc.next();
			}
			
		}
		
		for(int i=0; i<DAN; i++)
		{
			System.out.print(i+1+"분단");
			
			for(int j=0; j<SU; j++)
			{
				System.out.print(" / "+name[i][j]);
			}
			System.out.println();
		}

	}

}
