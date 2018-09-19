public class FirstLast
{
	public static void main(String[] args) 
	{
		String s = "Hello world!";
		first(s);
		last(s);
	}
	public static void first(String s)
	{
		System.out.println(s.substring(0, 5));
	}
	public static void last(String s)
	{
		System.out.println(s.substring(s.length() - 5));
	}
}