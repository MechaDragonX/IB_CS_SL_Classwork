public class TypeConvert 
{
	public static void main(String[] args)
	{
		// print();
		// alphaIndex();
		// charCast();
		System.out.printf("New string: %s", caesarShift("Julius Caesar was assassinated on March 15, 44 BCE."));
	}
	public static void print()
	{
		System.out.println(2.0 + 3); // 5
		System.out.println("1" + "2"); // 12
		System.out.println('a' + 1); // 68
		System.out.println(3 / 2 + 1.0); // 2	
		System.out.println("abc" + 1 + 2); // abc12
		System.out.println('A' + 1); // 66
		System.out.println(1.0 + 3 / 2); // 2.0
		System.out.println(1 + 2 + "abc"); // 3abc
		System.out.println('e' - 'a'); // 4
		System.out.println((1.0 + 3) / 2); // 2.0
		System.out.println(1 + "abc" + 2); // 1abc2
		System.out.println('e' - 'A' + '\n'); // 36
	}
	public static void alphaIndex()
	{
		char[] alpha = new char[] {'A', 'B', 'C', 'D', 'E'};
		for (int i = 0; i < alpha.length; i++ )
		{
			System.out.println(alpha[i] - 'A');
		}
	}
	public static void charCast()
	{
		int x = 100;
		System.out.println(x);
		System.out.println((char) x);
	}
	public static String caesarShift(String caesar)
	{
		char [] julius = caesar.toCharArray();
		String sjulius = "";
		
		System.out.printf("Original string : %s\n", caesar);
		
		for (int i = 0; i < julius.length; i++)
		{
			julius[i] = (char) (julius[i] +3);
			sjulius = new String(julius);
		}
		return sjulius;
	}
}