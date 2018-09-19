import java.util.Scanner;

public class Sept18
{
	public static void main(String[] args)
	{
		prob20();
		System.out.println();
		prob21();
		System.out.println();
		prob22();
		System.out.println();
		prob23();
		System.out.println();
		prob24();
		System.out.println();
		prob25();
		System.out.println();
		prob1();
		System.out.println();
		prob2();
		System.out.println();
		prob3();
		System.out.println();
	}
	public static void prob20()
	{
		for (int i = 1; i <= 6; i++)
		{
			System.out.println(18 * i - 22);
		}
		/*
		 * Print these numbers:
		 * 
		 * -4
		 * 14
		 * 32
		 * 50
		 * 68
		 * 86
		 */
	}
	public static void prob21() //oddStuff
	{
		int number = 4;
		for (int count = 1; count <= number; count++)
		{
			System.out.println(number);
			number = number /2;
		}
		/*
		 * Output:
		 * 4
		 * 2
		 */
	}
	public static void prob22()
	{
		int total = 25;
		for (int number = 1; number <= (total / 2); number++)
		{
			total = total - number;
			System.out.println(total + " " + number);
		}
		
		/*
		 * Output:
		 * 24 1
		 * 22 2
		 * 19 3
		 * 15 4
		 * 10 5
		 */
	}
	public static void prob23()
	{
		System.out.println("+---+");
		for (int i = 1; i <= 3; i++)
		{
			System.out.println("\\   /");
			System.out.println("/   \\");
		}
		System.out.println("+---+");
		
		/*
		 * Output:
		 * +---+
		 * \   /
		 * /   \
		 * \   /
		 * /   \
		 * \   /
		 * /   \
		 * +---+
		 */
	}
	public static void prob24()
	{
		for (int i = 1; i <= 3; i++)
			System.out.println("How many lines");
			System.out.println("are printed?");
			
		/*
		 * Output:
		 * How many lines
		 * How many lines
		 * How many lines
		 * are printed?
		 */
	}
	public static void prob25()
	{
		System.out.println("T-minus ");
		for (int i = 5; i >= 1; i--)
		{
			System.out.print(i + ", ");
		}
		System.out.println("Blastoff!");
		
		/*
		 * Output:
		 * T-minus 
		 * 5, 4, 3, 2, 1, Blastoff!
		 */
	}
	public static void prob1() //Projectile Motion
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value of s0 (initial position): ");
	    double s0 = sc.nextDouble();
	    System.out.println("Enter the value of v0 (initial velocity): ");
	    double v0 = sc.nextDouble();
	    System.out.println("Enter the value of t (time): ");
	    double t = sc.nextDouble();
	    System.out.println("Enter the value of a (acceleration: ");
	    double a = sc.nextDouble();
	    System.out.println();
		
		// s = s0 + v0t + (1/2)t^2
		
	    double s = s0 + v0 * t + 0.5 * Math.pow(t, 2);
		System.out.println("s0 + v0t + (1/2)t^2 = " + s);
	}
	public static void prob2()
	{
		int num = 1;
		int inc = 3;
		
		for (int i = 1; i <= 10; i ++)
		{
			if (i < 10) 
			{
				System.out.print(num + ", ");
			}
			else
			{
				System.out.print(num);
			}
			num += inc;
			inc += 2;
		}
		System.out.println();
		
		/*
		 * Print:
		 * 1 4 9 16 25 36 49 64 81 100
		 */
	}
	public static void prob3() //Fibonacci
	{
		int n1 = 1;
		int n2 = 1;
		System.out.println(n1); // 1st term
		System.out.println(n2); // 2nd term
		
		int n = 0;
		for (int i = 3; i <= 12; i++)
		{
			n = n1 + n2;
			System.out.println(n); // ith term
			
			n1 = n2;
			n2 = n;
		}
	}
}