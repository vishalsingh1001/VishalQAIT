import java.util.*;

class Calculator{
	static String function;
	static double x;
	static double y;
	static Scanner sc;
	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		System.out.println("For Add press 1");
		System.out.println("For Subtraction press 2");
		System.out.println("For Multiplication press 3");
		System.out.println("For Division press 4");
		function = sc.nextLine();
		switch(function)
		{
			case "1": add();
			break;
			case "2": sub();
			break;
			case "3": mul();
			break;
			case "4": div();
			break;
			default: System.out.println("Please enter the valid Number");
		}
	}
	public static void add(){
		Scanner sc1 = new Scanner(System.in);
		try{
			System.out.println("Please enter the First Number");
			x=sc1.nextDouble();
			System.out.println("Please enter the Second Number");
			y=sc1.nextDouble();
			System.out.println("Addition of two number is "+(x+y));
		}catch(Exception ex)
		{
			System.out.println("Please enter the valid Numbers");
			add();
		}
		
	}
	public static void sub(){
		Scanner sc1 = new Scanner(System.in);
		try{
			System.out.println("Please enter the First Number");
			x=sc1.nextDouble();
			System.out.println("Please enter the Second Number");
			y=sc1.nextDouble();
			System.out.println("Subtraction of two number is "+(x-y));
			}catch(Exception ex)
		{
			System.out.println("Please enter the valid Numbers");
			sub();
		}
	}
	public static void mul(){
		Scanner sc1 = new Scanner(System.in);
		try{
			System.out.println("Please enter the First Number");
			x=sc1.nextDouble();
			System.out.println("Please enter the Second Number");
			y=sc1.nextDouble();
			System.out.println("Multiplication of two number is "+(x*y));
		}catch(Exception ex)
		{
			System.out.println("Please enter the valid Numbers");
			mul();
		}
		
	}
	public static void div(){
		Scanner sc1 = new Scanner(System.in);
		try{
			System.out.println("Please enter the First Number");
			x=sc1.nextDouble();
			System.out.println("Please enter the Second Number");
			y=sc1.nextDouble();
			System.out.println("Division of two number is"+(x/y));
		}catch(Exception ex)
		{
			System.out.println("Please enter the valid Numbers");
			div();
		}
		
	}
}