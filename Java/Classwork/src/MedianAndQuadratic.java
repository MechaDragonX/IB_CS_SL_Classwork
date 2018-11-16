public class MedianAndQuadratic
{
	public static void main(String[] args)
	{
		System.out.println(medianof3(10, 1, 8));
	}
	public static int medianof3(int n1, int n2, int n3)
	{
		if (n1 < n2 && n1 < n3)
		{
			if (n2 < n3)
			{
				return n2;
			}
			else 
			{
				return n3;
			}
		}
		else if (n2 < n1 && n2 < n3)
		{
			if (n1 < n3)
			{
				return n1;
			}
			else 
			{
				return n3;
			}
		}
		else
		{
			if (n1 < n2)
			{
				return n1;
			}
			else 
			{
				return n2;
			}
		}
	}
	public static void Quaratic(int a, int b, int c)
	{
		double posx = 0;
		double negx = 0;
		plus(a, b, c);
		neg(a, b, c);
		System.out.println(check(posx, negx));
	}
	public static double plus(double a, double b, double c)
	{
		double posx = ((b * -1) + Math.pow((b * b - 4 * a * c), 0.5) / (2 * a));
		
		return posx;
	}
	public static double neg(double a, double b, double c)
	{
		double negx  = ((b * -1) - Math.pow((b * b - 4 * a * c), 0.5) / (2 * a));
		
		return negx;
	}
	public static String check(double posx, double negx)
	{
		if (Double.isNaN(posx) && Double.isNaN(negx))
		{
			return "No real roots.";
		}
		else if (! Double.isNaN(posx) && Double.isNaN(negx))
		{
			return "The root is " + posx + ".";
		}
		else if (Double.isNaN(posx) && ! Double.isNaN(negx))
		{
			return "The root is " + negx+ ".";
		}
		else if (posx == negx)
		{
			return "The root is " + posx+ ".";
		}
		else
		{
			return "The roots are " + posx + " & " + negx+ ".";
		}
	}
}
