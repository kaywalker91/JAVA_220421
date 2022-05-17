package Study0421;

import java.util.Scanner;

public class Study64_class 
{
	int a=300;
	String name="홍길동3";
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a=100;
		String name="홍길동";
		
		Test test = new Test();
		Test2 test2 = new Test2();
		Study64_class study = new Study64_class();
		Study65_ study1 =  new Study65_();
		
		System.out.println("Test클래스의 값 a : " + test.a);
		System.out.println("Test클래스의 값 name : "+ test.name);
		System.out.println();
		
		System.out.println("Test2클래스의 값 a : " + test2.a);
		System.out.println("Test2클래스의 값 name : "+ test2.name);
		System.out.println();
		
		System.out.println("study클래스의 값 a : " + study.a);
		System.out.println("study클래스의 값 name : "+ study.name);
		System.out.println();
		
		System.out.println("main의 값 a : " + a);
		System.out.println("main의 값 name : "+ name);
		System.out.println();
		
		System.out.println("Study65_의 값 a : " + study1.a);
		System.out.println("Study65_의 값 name : "+ study1.name);
		System.out.println();
	}

}

class Test
{
	int a=100;
	String name="홍길동";
}

class Test2
{
	int a=200;
	String name="홍길동2";
}
