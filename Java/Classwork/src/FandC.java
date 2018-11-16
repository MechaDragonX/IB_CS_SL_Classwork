import java.util.Scanner;

public class FandC 
{
	public static void main(String[] args) 
	{
		String input = input();
				
		// String input = "37C";
		num(input);
	}
	public static String input()
	{
		System.out.println("What temperature do you want to convert? Please write in it this format, \"32F\" or \"100C\".");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}
	public static void num(String input) 
	{
		String numstr = input.substring(0, (input.length() - 1));
		double num = Integer.parseInt(numstr);
		
		char unit = input.charAt(input.length() - 1);
		if (unit == 'F' || unit == 'f' || unit == 'C' || unit == 'c')
		{
			decideTime(unit, num, input);
		}
		else
		{
			input();
		}
	}
	public static void decideTime(char unit, double num, String input) 
	{
		if (unit == 'F' || unit == 'f')
		{
			System.out.println(ftoC(num, input));
		}
		else if (unit == 'C' || unit == 'c')
		{
			System.out.println(ctoF(num, input));
		}
	}
	public static String ftoC(double num, String input)
	{
		double val = (num - 32) * (5.0/9.0);
		return input + " is " + val + "C";
	}
	public static String ctoF(double num, String input)
	{
		double val = num * (9.0/5.0) + 32;
		return input + " is " + val+ "F";
	}
}