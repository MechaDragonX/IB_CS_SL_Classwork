import java.util.Scanner;

public class UberScanner
{
	public static void main(String[] args)
	{
		System.out.println(multiply());
	}
	public static double multiply()
	{
		System.out.println("This program can multiply.");
		System.out.println("Enter the first number.");
		System.out.print("> ");
		Scanner sc1 = new Scanner(System.in);
		double f1 = 0;
		if (sc1.hasNextDouble() == false)
		{
			System.out.println("Please type a real number.");
		}
		else
		{
			f1 = sc1.nextDouble();
		}
		System.out.println("Enter the second number.");
		System.out.print("> ");
		Scanner sc2 = new Scanner(System.in);
		double f2 = 0;
		if (sc2.hasNextDouble() == false)
		{
			System.out.println("Please type a real number.");
		}
		else
		{
			f2 = sc2.nextDouble();
		}
		return f1 * f2;
	}
	
}
