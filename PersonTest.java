/**
 * Assignment 2
 * 
 * September 28th, 2016
 * @author Dylan Grandjean
 *
 * Class destined to test the assignment 2's
 * program in order to asses it.
 */
import java.util.*;

public class PersonTest 
{
	public static void main(String[] arg)
	{
		Random rand = new Random();
		double n;
		double discount;
		double oldDiscount = 0;
		double total;
		
		//List<Double> price = new ArrayList<Double>();
		
		PreferredCustomer customer = new PreferredCustomer("Ryan", "25 Windpike Avenue", "(401) 555-4533", 0004534, true, 30.24);
		System.out.println(customer + "\n------------------------------------\n");
		
		while(customer.getCustomerPurchase() < 2500)
		{
			n = rand.nextInt(100);
			discount = customer.getDiscount();
			total = n - (n * discount);
			customer.addPurchaseAmount(total);
			if(discount > oldDiscount)
			{
				oldDiscount = discount;
				System.out.printf("Current balance: $%,.2f\n", customer.getCustomerPurchase());
				System.out.println("__________________________");
			}
			System.out.printf("%-10s$%,.2f\n%-10s%,.2f%%\n%-10s$%,.2f\n\n", "Price:", n, "Discount:", discount, "Total:", total);      
		}
		
		/* This loop creates a formatted output of the purchases. However, since we have not yet discussed
		 * lists, I have commented it out. Please feel free to comment out the first while loop and test
		 * this one if you would like to by uncommenting the list variable and the while loop below.
		 */
		
		/*while(customer.getCustomerPurchase() < 3500)
		{
			n = rand.nextInt(100);
			discount = customer.getDiscount();
			total = n - (n * discount);
			customer.addPurchaseAmount(total);
			
			if(discount > oldDiscount || customer.getCustomerPurchase() > 3500)
			{	
				oldDiscount = discount;
				System.out.print( "__________________________________________________________\n");
				for(int i = 0; i < price.size(); i = i+3)
					System.out.printf("%-10s$%,-6.2f | %-10s%,-6.2f%% | %-10s$%,-6.2f |\n", "Price:", price.get(i), "Discount:", price.get(i+1), "Total:", price.get(i+2));
				System.out.println("__________________________________________________________");
				System.out.printf("Current balance: $%,.2f\n\n", customer.getCustomerPurchase());
				price = new ArrayList<Double>();
			}
			
			price.add(n);
			price.add(discount);
			price.add(total);
		}*/
	}
}
