public class sept21
{
	public static void main(String[] args)
	{
		prob26();
		System.out.println();
		
		prob27();
		System.out.println();
		
		prob28();
		System.out.println();
		
		// prob29();
		// System.out.println();
		
		prob30();
		System.out.println();
		
		prob5();
		System.out.println();
		
		prob6();
		System.out.println();
		
		prob7();
		System.out.println();
		
		prob8();
		System.out.println();
	}
	public static void prob26()
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				System.out.print((i * j) + " ");
			}
			System.out.println();
		}
		
		/*
		 * Output:
		 * 1 2 3 4 5 6 7 8 9 10 
		 * 2 4 6 8 10 12 14 16 18 20 
		 * 3 6 9 12 15 18 21 24 27 30 
		 * 4 8 12 16 20 24 28 32 36 40 
		 * 5 10 15 20 25 30 35 40 45 50 
		 * etc.
		 */
	}
	public static void prob27()
	{
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10 - i; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * Output:
		 *          *
		 *         ***
		 *        *****
		 *       *******
		 * etc.
		 */
	}
	public static void prob28()
	{
		for (int i = 1; i <= 2; i++)
		{
			for (int j = 1; j <= 3; j++)
			{
				for (int k = 1; k <= 4; k++)
				{
					System.out.print("*");
				}
				System.out.print("!");
			}
			System.out.println();
		}
		/*
		 * Output:
		 * ****!****!****!
		 * ****!****!****!
		 */
	}
	public static void prob29()
	{
		for (int i = 1; i <= 2; i++)
		{
			for (int j = 1; j <= 3; j++)
			{
				for (int k = 1; k <= 4; k++)
				{
					System.out.print("*");
				}
			}
		}
		System.out.print("!");
		System.out.println();
	}
	public static void prob30()
	{
		for (int i = 1; i <= 2; i++)
		{
			for (int j = 1; j <= 3; j++)
			{
				for (int k = 1; k <= 4; k++)
				{
					System.out.print("*");
					System.out.print("!");
				}
				System.out.println();
			}
		}
		/*
		 * Output:
		 * *
		 * !
		 * *
		 * !
		 * *
		 * !
		 * *
		 * !
		 * 
		 * *
		 * !
		 * *
		 * !
		 * *
		 * !
		 * *
		 * !
		 * etc.
		 */
	}
	public static void prob5()
	{
		for (int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
	}
	public static void prob6()
	{
		for (int i = 1; i <= 7; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		/*
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 */
	}
	public static void prob7()
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 5; j > i; j--)
			{
				System.out.print(' ');
			}
			System.out.print(i + "\n");
		}
		/*
		 *     1
		 *    2 
		 *   3  
		 *  4   
		 * 5    
		 */
	}
	public static void prob8()
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		/*
		 *     1
		 *    22
		 *   333
		 *  4444
		 * 55555
		 */
	}
}