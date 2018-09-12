public class TwoRockets 
{
	public static void main(String[] args) 
	{
		tri();
		plusln();
		rec();
		plusln();
		us();
		plusln();
		rec();
		plusln();
		tri();
	}
	public static void tri()
	{
		System.out.println("  / \\      / \\");
		System.out.println(" /   \\    /   \\");
		System.out.println("/     \\  /     \\");
	}
	public static void plusln()
	{
		System.out.println("+------+ +------+");
	}
	public static void rec()
	{
		System.out.println("|      | |      |");
		System.out.println("|      | |      |");
	}
	public static void us()
	{
		System.out.println("|United| |United|");
		System.out.println("|States| |States|");
	}
}