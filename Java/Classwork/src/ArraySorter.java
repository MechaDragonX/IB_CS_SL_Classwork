public class ArraySorter
{
	public static void main(String[] args)
	{
		printSorted();
	}
	public static void printSorted()
	{
		int[] intArray = new int[] { 5, 7, 3, 9 };
		sortArray(intArray);
		for (int i = 0; i < intArray.length - 1; i++)
		{
			System.out.printf("%d, ", intArray[i]);
		}
	}
	public static int[] sortArray(int[] intArray)
	{
		for (int i = 0; i < intArray.length - 1; i++)
		{
			for (int j = 1; j < intArray.length; j++)
			{
				int a = intArray[i];
				int b = intArray[j];
				if (b < a)
				{
					int temp = a;
					a = b;
				}
				else if  (a == b)
				{
					a++;
					b++;
				}
			}
		}
		
		return intArray;
	}
}
