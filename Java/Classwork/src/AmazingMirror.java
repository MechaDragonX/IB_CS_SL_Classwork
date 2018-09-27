public class AmazingMirror
{
	public static final int MIRROR_SIZE = 3;
	public static void main(String[] args)
	{
		//topBottom();
		//int spaces = comSpace();
		//diaTop(spaces);
		//printDotRow(spaces);
		//printInverseDotRow(spaces);
		// int backspace = comSpaceBack();
		// dotBack(backspace);
		
		topBottom();
		topPart();
		bottomPart();
		topBottom();
	}
	public static void printDotRow(int spaces) 
	{
		for(int i = 1 ; i <= MIRROR_SIZE - 1; i++)
		{
			dotRow(spaces, i);
			spaces -= 2;
		}
		
	}
	public static void printInverseDotRow(int spaces) 
	{
		for(int i = 1 ; i <= MIRROR_SIZE - 1; i++)
		{
			dotRowInverse(0 , i);
			spaces += 2;
		}
		
	}
	public static void topBottom()
	{
		System.out.print('#');
		for (int x = 1; x <= MIRROR_SIZE * 4; x++)
		{
			System.out.print('=');
		}
		System.out.println('#');
	}
	public static int comSpace()
	{
		int spaces = 0;
		if ( MIRROR_SIZE > 1)
		{
			spaces = MIRROR_SIZE * 2;
		}
		
		return spaces;
	}
	public static void diaTop(int spaces)
	{
		spaces -= 2;
		System.out.print('|');
		for (int s = 1; s <= spaces; s++)
		{
			System.out.print(' ');
		}
		System.out.print("<><>");
		for (int s = 1; s <= spaces; s++)
		{
			System.out.print(' ');
		}
		System.out.println('|');
	}
	public static void dotRow(int spaces, int rownum)
	{
		spaces -= 4;
		System.out.print('|');
		for (int s = 1; s <= spaces; s++)
		{
			System.out.print(' ');
		}
		System.out.print("<>");
		for (int d = 1; d <= rownum; d++)
		{
			System.out.print("....");
		}
		System.out.print("<>");
		for (int s = 1; s <= spaces; s++)
		{
			System.out.print(' ');
		}
		System.out.println('|');
		
	}
	
	public static void dotRowInverse(int spaces, int rownum)
	{
		spaces -= 4;
		System.out.print('|');
		for (int s = 1; s <= spaces; s++)
		{
			System.out.print(' ');
		}
		System.out.print("<>");
		for (int d = rownum; d > 0; d++)
		{
			System.out.print("....");
		}
		System.out.print("<>");
		for (int s = 1; s <= spaces; s++)
		{
			System.out.print(' ');
		}
		System.out.println('|');
		
	}
	
	public static int comSpaceBack()
	{
		int backspace = MIRROR_SIZE * 2;
		if ( MIRROR_SIZE > 1)
		{
			backspace = 0;
		}
		
		return backspace;
	}
	public static void dotBack(int backspace)
	{
		for (int rownum = 1; rownum < MIRROR_SIZE; rownum++)
		{
			System.out.print('|');
			for (int s = 1; s <= backspace; s++)
			{
				System.out.print('-');
			}
			System.out.print("<>");
			for (int d = (MIRROR_SIZE * 4) - 4; d >= rownum; d--)
			{
				System.out.print("....");
			}
			System.out.print("<>");
			for (int s = 1; s <=  backspace; s++)
			{
				System.out.print('-');
			}
			System.out.println('|');
			backspace +=2;
		}
	}
	
	
	public static void printSpace(int spaces)
	{
		for(int s = 1; s <= spaces; s++)
		{
			System.out.print(' ');
		}
		
	}
	
	public static void printDot(int dots)
	{
		for(int d = 1; d <= dots; d++)
		{
			System.out.print('.');
		}
		
	}
	
	public static void topPart()
	{
		int spaces = (MIRROR_SIZE * 2) - 2 ;
		int dots = 0;
		
		for(int row = 1 ; row <= (MIRROR_SIZE * 2)/2 ; row++)
		{
			
			System.out.print("|");
			printSpace(spaces);
			System.out.print("<>");
			printDot(dots);
			System.out.print("<>");
			printSpace(spaces);
			System.out.print('|');
			System.out.println();
			
			spaces -= 2;
			dots += 4;
			
		}
	}
	
	public static void bottomPart()
	{
		int spaces = 0 ;
		int dots = MIRROR_SIZE * 4 - 4;
		
		for(int row = 1 ; row <= (MIRROR_SIZE * 2)/2 ; row++)
		{
			
			System.out.print("|");
			printSpace(spaces);
			System.out.print("<>");
			printDot(dots);
			System.out.print("<>");
			printSpace(spaces);
			System.out.print('|');
			System.out.println();
			
			spaces += 2;
			dots -= 4;
			
		}

	}
}
