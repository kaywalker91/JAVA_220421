package Study0421;

import java.util.Scanner;

public class Study61_sc_pr_array_for_for 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int MAX = 3;
		String name[] = new String[MAX];
		
		System.out.println("����̸� �����ϱ�.");
		
		for(int i=0; i<MAX; i++)
		{
			System.out.print(i+1+"�����:");
			name[i] = sc.next();
		}
		
		for(int i=0; i<MAX; i++)
		{
			System.out.println(i+1+"�� / " +name[i]);
		}

	}

}
