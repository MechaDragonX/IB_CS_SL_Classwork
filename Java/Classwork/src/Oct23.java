import java.util.*;

public class Oct23
{
	public static Scanner sc = new Scanner(System.in);
	public static void main (String[] args)
	{
		System.out.println(zeroDigits((int) (Math.pow(2, 32) - 1)));
	}
	public static void seashells()
	{
		boolean again = true;
		do
		{
			System.out.println("She sells seashells by the seashore.");
			System.out.print("Do you want to hear that again? ");
			String ifConfirm = sc.nextLine().toLowerCase();
			if (ifConfirm.equals("y"))
			{
				again = true;
			}
			else if (ifConfirm.equals("n"))
			{
				again = false;
			}
			else
			{
				System.out.print("Input is not valid.");
				ifConfirm = sc.nextLine().toLowerCase();
			}
		} while (again == true);
	}
	public static int zeroDigits(int num)
	{
		int zeros = 0;
		int remainder = 0;
		do
		{
			remainder = num % 10;
			if (remainder == 0)
			{
				zeros++;
			}
			num /= 10;
		} while (num > 0);
		return zeros;
	}
}