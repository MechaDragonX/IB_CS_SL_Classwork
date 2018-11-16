import java.util.Random;
import java.util.Scanner;

public class Oct27
{
	public static void main(String[] args)
	{
		System.out.println(isVowel('f'));
	}
	public static void prob11()
	{
		Random rng = new Random();
		int num = 0;
		int max = 900;
		do
		{
			num = rng.nextInt(1001);
			System.out.printf("Random number: %d\n", num);
		} while(num < max);
	}
	public static void printLetters(String text)
	{
		for (int i = 0; i < text.length(); i++)
		{
			System.out.print(text.charAt(i) + "-");
		}
		System.out.println();
	}
	public static void prob12(String text)
	{
//		for (int i = 0; i < text.length(); i++)
//		{
//			if (i < text.length() - 1)
//			{
//				System.out.print(text.charAt(i) + "-");
//			}
//			else
//			{
//				System.out.print(text.charAt(i));
//			}
//		}
		int i = 0;
		while (i < text.length() - 1)
		{
			System.out.print(text.charAt(i) + "-");
			i++;
		}
		System.out.print(text.charAt(i));
		System.out.println();
	}
	public static void prob13()
	{
		Scanner sc = new Scanner(System.in);
		
		int exitNumber = -1;
		System.out.print("Type a number (or -1 to stop): ");
		int input = sc.nextInt();
		int max = input;
		int min = input;
		while (input != exitNumber)
	    {
        	
			if (input < min)
			{
				min = input;
			}
			else if (input >  max)
			{
				max = input;
			}
			System.out.print("Type a number (or -1 to stop): ");
			input = sc.nextInt();
	    } 
		if (min != exitNumber)
		{
			System.out.printf("Maximum was %d\n", max);
			System.out.printf("Minimum was %d\n", min);
		}
	}
	public static void prob14()
	{
		int x = 27;
		int y = -1;
		int z = 32;
		boolean b = false;
		
		System.out.println(!b); //true
		System.out.println(b || true); //true
		System.out.println(( x > y) && (y > z)); // false
		System.out.println((x == y) || (y == z)); //false
		System.out.println(!(x % 2 == 0)); //true
		System.out.println((x % 2 != 0) && b); // false
		System.out.println(b && !b); // false
		System.out.println(b || !b);  //true
		System.out.println((x < y) == b); // true
		System.out.println(!(x /2 == 13) || b || (z *3 == 96)); //true
		System.out.println((z < x) == false); //true
		System.out.println(!((x >0) && (y <0))); //false
		
	}
	public static boolean isVowel(char character)
	{
		if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i' || character == 'I' || character == 'o' || character == 'O' || character == 'u' || character == 'U')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
