public class oct16Ex
{
	public static void main(String[] args)
	{
		System.out.println(range(5, 5));
	}
	// Number 2: String Repeater
	public static String rep1(String str, int num)
	{
		String end = "";
		if (num <= 0)
		{
			return end;
		}
		for (int i = 1; i <= num; i++)
		{
			end += str;
		}
		return end;
	}
	// Number 4: Number of Days in a Month
	public static int daysInMonth(int month)
	{
		int day = 0;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			 day = 31;
		}
		else if (month == 2)
		{
			 day = 28;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			 day = 30;
		}
		return day;
	}
	// Number 5: Printing the Range Between 2 Number
	public static String range(int num1, int num2)
	{
		String range = "";
		if (num1 < num2)
		{
			for (int i = num1; i < num2; i++)
			{
				range += i + " ";
			}
		}
		else if (num1 > num2)
		{
			for (int i = num1; i > num2; i--)
			{
				range += i + " ";
			}
		}
		range += num2;
		return range;
	}
}
