import java.util.Scanner;

public class Oct3
{
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println(min(1, 2, 3));
		System.out.println(countQuarters(64));
		repeat();
	}
	public static int min(int a, int b, int c)
	{
		return (int) Math.min(Math.min((double) a,(double)  b), (double) c);
	}
	public static int countQuarters(int cents)
	{
		int quarters = cents / 25;
		if (quarters > 3)
		{
			return quarters % 4;
		}
		else
		{
			return quarters;
		}
	}
	public static void repeat()
	{
		System.out.println("PLease type in your phrase.");
		System.out.print("> ");
		String phrase = sc.nextLine();
		System.out.println("How many time do you want to repat your phrase?");
		System.out.print("> ");
		int repeat = sc.nextInt();
		for (int x = 1; x <= repeat; x++)
		{
			System.out.println(phrase);
		}
	}
}
