import java.util.Scanner;

public class NewFactorial
{
	public static void main(String[] args)
	{
		System.out.println("Please type in the number you want to take the factorial of in this format: \"10!\"");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		toInt(input);
	}
	public static void toInt(String input)
	{
		int num = Integer.parseInt(input.substring(0, input.length() - 1));
		factorial(num);
	}
	public static void factorial(int num)
	{
		System.out.printf("%d * ", num);
		
		int sum = num;
		for (int x = num - 1; x > 0 ; x--)
		{
			sum *= x;
			if (x != 1)
			{
				System.out.printf("%d * ", x);
			}
			else
			{
				System.out.printf("%d = %d", x, sum);
			}
		}
	}
}