import java.util.Scanner;

public class QuadraticFormula
{
	static Scanner sc = new Scanner(System.in);
	static double a, b, c = 0;
	
	public static void main(String[] args)
	{
		System.out.println(input());
		double posx = plus(a, b, c);
		double negx = neg(a, b, c);
		System.out.println(check(posx, negx));
	}
	public static double getInput(String prompt)
	{
		double Q = 0;
		
		System.out.printf("Enter the %s number.\n", prompt);
		System.out.print("> ");
		if (sc.hasNextDouble() == false)
		{
			System.out.println("Please type a rational number.");
		}
		else
		{
			Q = sc.nextDouble();
		}
		
		return Q;
	}
	public static String input()
	{
		a = getInput("first");
		b = getInput("second");
		c = getInput("thrid");
		
		return "\n" + a + "x" + "^2" + " + " + b + "x" + " + " + c + "\n";
	}
	public static double plus(double a, double b, double c)
	{
		double posx = ((b * -1) + Math.pow((b * b - 4 * a * c), 0.5) / (2 * a));
		
		return posx;
	}
	public static double neg(double a, double b, double c)
	{
		double negx  = ((b * -1) - Math.pow((b * b - 4 * a * c), 0.5) / (2 * a));
		
		return negx;
	}
	public static String check(double posx, double negx)
	{
		if (Double.isNaN(posx) && Double.isNaN(negx))
		{
			return "No real roots.";
		}
		else if (! Double.isNaN(posx) && Double.isNaN(negx))
		{
			return "The root is " + posx + ".";
		}
		else if (Double.isNaN(posx) && ! Double.isNaN(negx))
		{
			return "The root is " + negx+ ".";
		}
		else if (posx == negx)
		{
			return "The root is " + posx+ ".";
		}
		else
		{
			return "The roots are " + posx + " & " + negx+ ".";
		}
	}
}