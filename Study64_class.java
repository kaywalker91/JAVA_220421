package Study0421;

import java.util.Scanner;

public class Study64_class 
{
	int a=300;
	String name="ȫ�浿3";
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a=100;
		String name="ȫ�浿";
		
		Test test = new Test();
		Test2 test2 = new Test2();
		Study64_class study = new Study64_class();
		Study65_ study1 =  new Study65_();
		
		System.out.println("TestŬ������ �� a : " + test.a);
		System.out.println("TestŬ������ �� name : "+ test.name);
		System.out.println();
		
		System.out.println("Test2Ŭ������ �� a : " + test2.a);
		System.out.println("Test2Ŭ������ �� name : "+ test2.name);
		System.out.println();
		
		System.out.println("studyŬ������ �� a : " + study.a);
		System.out.println("studyŬ������ �� name : "+ study.name);
		System.out.println();
		
		System.out.println("main�� �� a : " + a);
		System.out.println("main�� �� name : "+ name);
		System.out.println();
		
		System.out.println("Study65_�� �� a : " + study1.a);
		System.out.println("Study65_�� �� name : "+ study1.name);
		System.out.println();
	}

}

class Test
{
	int a=100;
	String name="ȫ�浿";
}

class Test2
{
	int a=200;
	String name="ȫ�浿2";
}
