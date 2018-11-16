public class Nov15
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println(average(new int[] { 1, -2, 4, -4, 9, -6, 16, -8, 25, -10 }));
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void prob4(int min, int max)
	{
		int elements = (max - min) / 2 ;
		int[] odds = new int[elements];
		int j = 0;
		for (int i = min; i < max; i++)
		{
			if (i % 2 != 0)
			{
				odds[j] = i;
				j++;
			}
		}
		printArray(odds);
	}
	public static void printArray(int[] array)
	{
		System.out.println("----");
		for (int i = 0 ; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("----");
	}
	public static int max(int[] array) throws Exception
	{
		int max = 0;
		if (array == null)
		{
			throw new Exception("Nonexistant Arguement");
		}
		else if (array.length == 0)
		{
			throw new Exception("Invalid Arguement");
		}
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		return max;
	}
	public static double average(int[] array) throws Exception
	{
		double sum = 0;
		double average = 0;
		if (array == null)
		{
			throw new Exception("Nonexistant Arguement");
		}
		else if (array.length == 0)
		{
			throw new Exception("Invalid Arguement");
		}
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		average = sum / array.length;
		return average;
	}
}