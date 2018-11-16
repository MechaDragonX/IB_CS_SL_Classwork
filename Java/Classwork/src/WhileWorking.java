import java.util.*;

public class WhileWorking
{
	public static void main(String[] args)
	{
		michaelSquared();
	}
	public static int sum100()
	{
		int sum = 0;
		int i = 1;
		while (i <= 100)
		{
			sum += i;
			i++;
		}
		return sum;
	}
	public static void guess()
	{
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();
		int num = rng.nextInt(100) + 1;
		int guess = 0;
		int numGuess = 0;
		System.out.println("Welcome to the Guessing Game!\nI am thinking of a number between 1 and 100, inclusive.\n");
		System.out.println("Please make a guess.");
		guess = sc.nextInt();
		numGuess++;
		do
		{
			if (guess < num)
			{
				System.out.println("I am thinking of a number that is larger than yours.");
				guess = sc.nextInt();
				numGuess++;
			}
			else if (guess > num)
			{
				System.out.println("I am thinking of a number that is smaller than yours.");
				guess = sc.nextInt();
				numGuess++;
			}
		} while(guess != num);
		System.out.printf("You did it! My number is %d.\nIt took you %d tries!", num, numGuess);
	}
	public static void michaelSquared()
	{
		Scanner sc = new Scanner(System.in);
		Random rng = new Random();
		int num = rng.nextInt(10) + 1;
		int guess = 0;
		int numGuess = 0;
		System.out.println("Welcome to the Michael Squared Guessing Game!\nI am thinking of a number between 1 and 10, inclusive.\n");
		System.out.println("Your task, should you choose to accept it; is to guess the square of my number.");
		System.out.println("Please make a guess.");
        guess = sc.nextInt();
		numGuess++;
		while(true)
	    {
	        if (guess < (num * num))
	        {
	            System.out.println("My square is larger than yours.");
	            guess = sc.nextInt();
	            numGuess++;
	        }
	        else if (guess > (num * num))
	        {
	            System.out.println("My square is smaller than yours.");
	            guess = sc.nextInt();
	            numGuess++;
	        }
	        else
	        {
	              break;
	        }
	    }
		System.out.printf("You did it! My square is %d. My number is %d.\n", num * num, num);
		System.out.printf("It took you %d guess(es) to guess it!\n", numGuess);
	}
//	public static void 
}