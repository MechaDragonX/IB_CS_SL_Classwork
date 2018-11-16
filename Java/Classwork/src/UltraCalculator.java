import java.util.*;

public class UltraCalculator
{
	public static void main(String[] args)
	{
		calculator();
	}
	public static void calculator()
	{
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1;
		String input = "";
		boolean isRadian = false;
		double solution = 0.0;
		System.out.println("Welcome to the calculator program!");
		while (true)
		{
			System.out.println("\nPlease enter an expression.");
			input = sc.nextLine().toLowerCase().trim();
			sc1 = new Scanner(input);
			if (input.equals("quit"))
			{
				System.out.println("Thanks for using this calculator program!");
				break;
			}
			else if (input.equals("r"))
			{
				System.out.println("You are now in radian mode!");
				isRadian = true;
			}
			else if (input.equals("d"))
			{
				System.out.println("You are now in degree mode!");
				isRadian = false;
			}
			else if (input.equals("help"))
			{
				System.out.println("This calculator can do many things.\n");
				System.out.println("If you type \"d\" you can use angle measures in degrees and if you type \"d\" you can use angle measures in radians.");
				System.out.println("If you type \"pi\" with a slash in front you can use \"Pi\" and if you type \"e\" with a slash in front you can use \"e\".\n");
				System.out.println("This calculator can do the following two operand operations:");
				System.out.println("Add (+)");
				System.out.println("Subtract (-)");
				System.out.println("Multiply (*)");
				System.out.println("Divide (/)");
				System.out.println("Exponentiate (^)");
				System.out.println("Modulo (%)\n");
				System.out.println("This calculator can do the following one operand operations:");
				System.out.println("Absolute Value (|)");
				System.out.println("Square Root (v)");
				System.out.println("Cube Root (3v)");
				System.out.println("Round to the nearest integer (~)");
				System.out.println("Sine (s)");
				System.out.println("Cosine (c)");
				System.out.println("Tangent (t)");
				System.out.println("Arcsine (as)");
				System.out.println("Arcosine (ac)");
				System.out.println("Arctangent (at)");
			}
			else
			{
				if (sc1.hasNextDouble())
				{
					try
					{
						solution = twoOptokens(sc1, isRadian);
						System.out.println(input + " = " + solution);
						
					}
					catch (Exception e)
					{
						System.out.println(e.getMessage());
						continue;
					}
				}
				else
				{
					String operator = "";
					try
					{
						operator = sc1.next();
					}
					catch (Exception e)
					{
						System.out.println("ERROR: You didn't type anything or the number was too big.");
						continue;
					}
					switch (operator)
					{
						case "|":
						case "v":
						case "~":
						case "s":
						case "c":
						case "t":
						case "l":
						case "3v":
						case "as":
						case "ac":
						case "at":
							try 
							{
								solution = oneOptokens(sc1, operator, isRadian);
								System.out.println(input + " = " + solution);
							}
							catch(Exception e)
							{
								System.out.println(e.getMessage());
							}
							break;
						default:
							Exception e = new Exception("ERROR: The operator specified is invalid or is nonexistant.");
							System.out.println(e.getMessage());
					}
				}
			}
		}
	}
	public static double twoOptokens(Scanner sc1, boolean isRadian) throws Exception
	{
		double num1 = 0;
		String operator = "";
		double num2 = 0;
		String next = "";
		if (sc1.hasNextDouble())
		{
			num1 = sc1.nextDouble();
		}
		else
		{
			throw new Exception("ERROR: The first number is invalid or nonexistant.");
		}
		
		if (sc1.hasNextDouble() || !sc1.hasNext())
		{
			throw new Exception("ERROR: There is not an operator specified.");
		}
		else
		{
			operator = sc1.next();
		}
		
		if (sc1.hasNextDouble())
		{
			num2 = sc1.nextDouble();
		}
		else if (operator.equals("!"))
		{
			double num = num1;
			return oneOpEvaluate(operator, num, isRadian);
		}
		else
		{
			throw new Exception("ERROR: The second number is invalid or nonexistant.");
		}
		return twoOpEvaluate(num1, operator, num2);
	}
	public static double oneOptokens(Scanner sc1, String operator, boolean isRadian) throws Exception
	{
		double num = 0;
		if (sc1.hasNextDouble())
		{
			num = sc1.nextDouble();
		}
		else
		{
			throw new Exception("ERROR: The number is invalid or nonexistant.");
		}
		return oneOpEvaluate(operator, num, isRadian);
	}
	public static double twoOpEvaluate(double num1, String operator, double num2) throws Exception
	{
		double solution = 0;
		switch (operator)
		{
			case "+":
				solution = num1 + num2;
				break;
			case "-":
				solution = num1 - num2;
				break;
			case "*":
				solution = num1 * num2;
				break;
			case "/":
				solution = num1 / num2;
				break;
			case "%":
				solution = num1 % num2;
				break;
			case "^": 
			{	
				solution = Math.pow(num1, num2);
				break;
			}
			default:
				throw new Exception("ERROR: The operator specified is invalid or nonexistant.");
		}
		if (solution > Double.MAX_VALUE)
		{
			throw new Exception("ERROR: The answer is too big.");
		}
		else if (Double.isNaN(solution))
		{
			throw new Exception("ERROR: The answer is not real.");
		}
		return solution;
	}
	public static double oneOpEvaluate(String operator, double num, boolean isRadian) throws Exception
	{
		double solution = 0;
		switch (operator)
		{
			case "|":
				solution = Math.abs(num);
				break;
			case "v":
				solution = Math.sqrt(num);
				break;
			case "~":
				solution = Math.round(num);
				break;
			case "s":
				if (isRadian)
				{
					solution = Math.sin(num);
				}
				else
				{
					solution = Math.sin(Math.toRadians(num));
				}
				break;
			case "c":
				if (isRadian)
				{
					solution = Math.cos(num);
				}
				else
				{
					solution = Math.cos(Math.toRadians(num));
				}
				break;
			case "t": 
				if (isRadian)
				{
					solution = Math.tan(num);
				}
				else
				{
					solution = Math.tan(Math.toRadians(num));
				}
				break;
			case "l":
				solution = Math.log10(num);
				break;
			case "3v":
				solution = Math.cbrt(num);
				break;
			case "as":
				if (isRadian)
				{
					solution = Math.asin(num);
				}
				else
				{
					solution = Math.asin(Math.toRadians(num));
				}
			case "ac":
				if (isRadian)
				{
					solution = Math.acos(num);
				}
				else
				{
					solution = Math.acos(Math.toRadians(num));
				}
			case "at":
				if (isRadian)
				{
					solution = Math.atan(num);
				}
				else
				{
					solution = Math.atan(Math.toRadians(num));
				}
			case "!":
				if (num % 1 != 0)
				{
					throw new Exception("ERROR: You can only take the factorial of a whole number.");
				}
				else
				{
					solution = num;
					for (double i = num - 1; i > 0; i--)
					{
						solution *= i;
					}
				}
				break;
		}
//		if (solution < Double.MIN_VALUE)
//		{
//			throw new Exception("ERROR: The answer is too small.");
//		}
		if (solution > Double.MAX_VALUE)
		{
			throw new Exception("ERROR: The answer is too big.");
		}
		
		else if (Double.isNaN(solution))
		{
			throw new Exception("ERROR: The answer is not real.");
		}
		return solution;
	}
}