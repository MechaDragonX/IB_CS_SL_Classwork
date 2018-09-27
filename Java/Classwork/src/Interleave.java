import java.util.Scanner;

public class Interleave
{
	public static void main(String[] args)
	{
//		System.out.println(Array("abc", "def", "ghi")); // Pass
//		System.out.println(Array("abcd", "efg", "hij")); // Pass
//		System.out.println(Array("abc", "defg", "hij")); // Pass
//		System.out.println(Array("abc", "def", "ghij")); // Pass
//		System.out.println(Array("abcd", "efgh", "ijk")); // Pass
//		System.out.println(Array("abc", "defg", "hijk")); // Pass
		
		input();
	}
		public static void input()
	{
//		System.out.println("How strings do you want?");
//		Scanner sc1 = new Scanner(System.in);
//		int num = sc1.nextInt();

		System.out.println("Type string 1");
		Scanner sc2 = new Scanner(System.in);
		String s1 = sc2.nextLine();
			
		System.out.println("Type string 2");
		Scanner sc3 = new Scanner(System.in);
		String s2 = sc3.nextLine();
		
		System.out.println("Type string 3");
		Scanner sc4 = new Scanner(System.in);
		String s3 = sc4.nextLine();
		
		System.out.println(Array(s1, s2, s3));
		// System.out.println(charAt(s1, s2, s3));
	}
	public static String Array(String s1, String s2, String s3)
	{
		char[] array1 = s1.toCharArray(); // Converting the strings into char arrays
		char[] array2 = s2.toCharArray();
		char[] array3 = s3.toCharArray();
		
		int LengthIndex1 = array1.length - 1; // Final Index, to prevent out of bounds error
		int LengthIndex2 = array2.length - 1;
		int LengthIndex3 = array3.length - 1;
		
		char char1; // char from arrayx[]
		char char2;
		char char3;
		
		String newstr = ""; // new string to be built from chars
		
		for (int i = 0; i <= LengthIndex1 || i <= LengthIndex2 || i <= LengthIndex3; i++) // Goes until final index of the longest array
		{
			if (i <= LengthIndex1 && i <= LengthIndex2 && i <= LengthIndex3) // Are the same length?
			{
				char1 = array1[i]; // Find the value of [i] for both arrays
				char2 = array2[i];
				char3 = array3[i];
				newstr += new StringBuilder().append(char1).append(char2).append(char3).toString(); // Make a new string by combining them
			}
			else if (i > LengthIndex1 && i <= LengthIndex2 && i <= LengthIndex3)
			{
				char2 = array2[i];
				char3 = array3[i];
				newstr += new StringBuilder().append(char2).append(char3).toString();
			}
			else if (i <= LengthIndex1 && i > LengthIndex2 && i <= LengthIndex3)
			{
				char1 = array1[i];
				char3 = array3[i];
				newstr += new StringBuilder().append(char1).append(char3).toString();
			}
			else if (i <= LengthIndex1 && i <= LengthIndex2 && i > LengthIndex3)
			{
				char1 = array1[i];
				char2 = array2[i];
				newstr += new StringBuilder().append(char1).append(char2).toString();
			}
			else if (i > LengthIndex1 && i > LengthIndex2 && i <= LengthIndex3)
			{
				char3 = array3[i];
				newstr += new StringBuilder().append(char3).toString();
			}
			else if (i <= LengthIndex1 && i > LengthIndex2 && i > LengthIndex3)
			{
				char1 = array1[i];
				newstr += new StringBuilder().append(char1).toString();
			}
			else if  (i > LengthIndex1 && i <= LengthIndex2 && i > LengthIndex3)
			{
				char2 = array2[i];
				newstr += new StringBuilder().append(char2).toString();
			}
		}
		return newstr;
	}
	public static String charAt(String s1, String s2, String s3)
	{
		int LengthIndex1 = s1.length() - 1; // Final Index, to prevent out of bounds error
		int LengthIndex2 = s2.length() - 1;
		
		char char1; // char from sx
		char char2;
		
		String newstr = ""; // new string to be built from chars
		
		for (int i = 0; i <= LengthIndex1 || i <= LengthIndex2; i++) // Goes until final index of the longest String
		{
			if (i <= LengthIndex1 && i <= LengthIndex2) // Are the same length?
			{
				char1 = s1.charAt(i); // Find the value of (i) for both Strings
				char2 = s2.charAt(i);
				newstr += new StringBuilder().append(char1).append(char2).toString(); // Make a new string by combining them
			}
			else if (i > LengthIndex1 && i <= LengthIndex2) // Is 1 larger than 2?
			{
				char2 = s2.charAt(i); // Find the value of (i) for 2 only
				newstr += new StringBuilder().append(char2).toString();
			}
			else if (i <= LengthIndex1 && i > LengthIndex2) // Is 2 larger than 1?
			{
				char1 = s1.charAt(i); // Find the value of (i) 1 only
				newstr += new StringBuilder().append(char1).toString();
			}
		}
		return newstr;
	}
}