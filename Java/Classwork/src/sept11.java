import java.util.Scanner;

public class sept11 
{
	public static void main(String[] args) 
	{
		//Practicing statements without "ln"
		System.out.print("My name is ");
		System.out.println("Raghav Vivek.");
		System.out.println("I love Java!\n");
		
		//Why do we need this? Didn't the previous lines accomplish this?
		System.out.println("Go Spartans!");
		System.out.println("Go Spartans!");
		System.out.println("Go Spartans!\n");
		
		//Method calling and printing
		System.out.println("Do you want to send a \"letter\", check out a \"book\", or see your \"transcript\"?");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		profile(s);
		System.out.println("Press any key to continue...");
		sc.nextLine();
		
		//Witch Hexes and School Stops
		hexWhole();
		
		hexdownPlus();
		
		stopSign();
		
		hexupPlus();
	}
	public static void profile(String s)
	{
		s = s.toLowerCase();
		
		if (s.equals("letter"))
		{
			System.out.println("\nPlease use these credentials to send a letter!\n");
			System.out.println("Vivek, Raghav");
			System.out.println("3932 355th PL SE\nSammamish, Washington 98029\n");
		}
		else if (s.equals("book"))
		{
			System.out.println("\nPlease use these credentials to check out a book!\n");
			System.out.println("Vivek, Raghav");
			System.out.println("Student ID: 0869903\n");
		}
		else if (s.equals("transcript"))
		{
			System.out.println("\nPlease use these credentials to see your transcripts!\n");
			System.out.println("Vivek, Raghav");
			System.out.println("Student ID: 0869903\n");
		}
		else
		{
			System.out.println("\nUNKNOWN\nCOMMAND\n\nPLEASE TRY AGAIN\n");
		}
	}
	//Methods for the hexes and stops
	public static void hexup()
	{
		System.out.println("  ___________");
		System.out.println(" /           \\");
		System.out.println("/             \\");
	}
	public static void hexdown()
	{
		System.out.println("\\             /");
		System.out.println(" \\           /");
		System.out.println("  ¯¯¯¯¯¯¯¯¯¯¯");
	}
	public static void plusln()
	{
		System.out.println("+-------------+");
	}
	public static void stopln()
	{
		System.out.println("|     STOP    |");
	}
	public static void hexupPlus() 
	{
		hexup();
		plusln();
		System.out.println();
	}
	public static void stopSign() 
	{
		hexup();
		stopln();
		hexdown();
		System.out.println();
	}
	public static void hexdownPlus() 
	{
		hexdown();
		plusln();
		System.out.println();
	}
	public static void hexWhole() 
	{
		hexup();
		hexdown();
		System.out.println();
	}
}