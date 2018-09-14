import java.util.Scanner;

public class FandC 
{
	public static void main(String[] args) 
	{
		System.out.println("What temperature do you want to convert? PLease write in it this format, \"32F\" or \"100C\".");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
				
		// String input = "37C";
		num(input);
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
			System.out.println("Please write you rtemperature in the format, \"32F\" or \"100C\".");
		}
	}
	public static void decideTime(char unit, double num, String input) 
	{
		if (unit == 'F' || unit == 'f')
		{
			ftoC(num, input);
		}
		else if (unit == 'C' || unit == 'c')
		{
			ctoF(num, input);
		}
	}
	public static void ftoC(double num, String input)
	{
		double val = (num - 32) * (5.0/9.0);
		System.out.format("%s is %fC", input, val);
	}
	public static void ctoF(double num, String input)
	{
		double val = num * (9.0/5.0) + 32;
		System.out.format("%s is %fF", input, val);
	}
}