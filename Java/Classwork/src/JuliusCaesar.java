public class JuliusCaesar
{
	public static void main(String[] args)
	{
		System.out.printf("New String: %s", caesarShift("JuliusCaesar"));
	}
	public static String caesarShift(String caesar)
	{
		char julius = '0';
		StringBuilder s = new StringBuilder();
		
		System.out.printf("Original string : %s\n", caesar);
		
		for (int i = 0; i < caesar.length(); i++)
		{
			julius = (char) (caesar.charAt(i) + 3);
			s.append(julius);
		}
		return s.toString();
	}
}