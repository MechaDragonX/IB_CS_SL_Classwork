public class RecFac
{
	public static void main(String[] args)
	{
		int count = 10;
		Fibonacci(count);
	}
	public static void Fibonacci(int count)
	{
		System.out.println(1);
        System.out.println(1);
        Fibonacci(1, 1, count);
	}
    public static void Fibonacci(int initA, int initB, int count)
    {
        if(count == 0)
        {
            return;
        }
        int newTerm = initA + initB;
        System.out.println(newTerm);
        Fibonacci(initB, newTerm, count - 1);
    }
}