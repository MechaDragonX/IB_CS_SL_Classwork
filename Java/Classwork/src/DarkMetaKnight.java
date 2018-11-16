public class DarkMetaKnight
{
	public static final int MIRROR_SIZE = 50;
	public static void main(String[] args)
	{
		printMirror();
	}
	public static void printMirror() {
		topBottom();
		topHalf();
		bottomHalf();
		topBottom();
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
	public static void printDot(int dot) {
		for (int d = 1; d <= dot; d++)
		{
			System.out.print('.');
		}
	}
	public static void printSpace(int space) {
		for (int x = 1; x <= space; x++)
		{
			System.out.print(" ");
		}
	}
	public static void topHalf()
	{
		int space = (MIRROR_SIZE * 2) - 2;
		int dot = 0;
		for (int row = 1; row <= MIRROR_SIZE; row++)
		{
			System.out.print('|');
			printSpace(space);
			System.out.print("<>");
			printDot(dot);
			System.out.print("<>");
			printSpace(space);
			System.out.println('|');
			space -= 2;
			dot += 4;
		}
	}
	public static void bottomHalf()
	{
		int space = 0;
		int dot = MIRROR_SIZE * 4 - 4;
		for (int row = 1; row <= MIRROR_SIZE; row++)
		{
			System.out.print('|');
			printSpace(space);
			System.out.print("<>");
			printDot(dot);
			System.out.print("<>");
			printSpace(space);
			System.out.println('|');
			space += 2;
			dot -= 4;
		}
	}
}
