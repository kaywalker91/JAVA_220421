package Study0421;

import java.util.Scanner;

public class Study62_2array_2for 
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
				System.out.print(i+1+"�ݻ��"+(j+1)+"���л� : ");
				name[i][j] = sc.next();
			}
			
		}
		
		for(int i=0; i<DAN; i++)
		{
			for(int j=0; j<1; j++)
			{
				System.out.println(i+1+"�д� / "+name[i][j]+" / "+name[i][j+1]+" / "+name[i][j+2]);
			}
		}
	}

}
