public class ShoppingCart
{
	public static void main(String[] args)
	{
		cart();
	}
	public static void cart()
	{
		double[] prices = new double[] {0.99, 1.99, 2.99, 3.99, 4.99};
		double sum = 0.0;
		
		System.out.println("-----Costco-----");
		System.out.println("----Wholesale---" + '\n');
	
		for (int i = 0; i < prices.length; i++)
		{
			System.out.printf("Item #%d :  $%1.2f\n",i, prices[i]);
			sum += prices[i];
		}
		
		System.out.println();
		System.out.printf("Subtotal: $%2.2f\n", sum);
		
		double tax = sum * 0.1;
		double val = sum + tax;
		System.out.printf("Sales Tax: $%1.2f\n", tax);
		
		val += 7.95;
		System.out.println("Shipping Cost: $7.95");
		
		System.out.printf("Total: $%2.2f", val);
	}
}