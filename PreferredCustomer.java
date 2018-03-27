/**
 * Assignment 2
 * 
 * September 28th, 2016
 * @author Dylan Grandjean
 *
 * Class destined to extend Customer class
 * allowing a preferred customer to benefit
 * from store discount.
 */
public class PreferredCustomer extends Customer 
{
	//Fields:
	private double customerPurchase;
	
	//Methods:
	//CONSTRUCTORS
	/**
	 * PreferredCustomer, no-arg constructor.
	 * Initialize all fields to their default values.
	 */
	public PreferredCustomer() 
	{
		super();
		customerPurchase = 0; 
	}
	
	/**
	 * PreferredCustomer, copy constructor.
	 * @param toCopy -- A PreferredCustomer object to copy into the current object.
	 */
	public PreferredCustomer(PreferredCustomer toCopy) 
	{ 
		super(toCopy);
		this.customerPurchase = toCopy.customerPurchase; 
	}
	
	/**
	 * PreferredCustomer, constructor which assigns a value to all of the object's fields.
	 * @param n -- String, value to put in the name field.
	 * @param add -- String, value to put in the address field.
	 * @param num -- String, value to put in the telephone field.
	 * @param custNum -- Int, value to put in the custNum field.
	 * @param signedUp -- Boolean, value to put in the signedUp field.
	 * @param purchaseAmount -- Int, value to put in the purchaseAmount field.
	 */
	public PreferredCustomer(String n, String add, String num, int custNum, boolean signedUp, double purchaseAmount)
	{ 
		super(n, add, num, custNum, signedUp);
		this.customerPurchase = purchaseAmount; 
	}
	
	//OTHER METHODS
	/**
	 * addPurchaseAmount, method which adds a purchase amount to the customerPurchase field.
	 * @param amount -- Purchase amount to add to the customerPurchase field.
	 */
	public void addPurchaseAmount(double amount)
	{
		customerPurchase += amount;
	}
	
	/**
	 * getDiscount, method to determine the discount percentage of customer.
	 * @return Discount percentage.
	 */
	public double getDiscount()
	{
		if(customerPurchase >= 2000)
			return 0.1;
		else if(customerPurchase >= 1500)
			return 0.07;
		else if(customerPurchase >= 1000)
			return 0.06;
		else if(customerPurchase >= 500)
			return 0.05;
		else
			return 0;
	}
	
	/**
	* toString, return a String representing the fields of the object.
	*/
	public String toString()
	{
		return String.format("%-25s%-15s\n%-25s%-15s\n%-25s%-15s\n%-25s%-15d\n%-25s%-15s\n%-25s$%,-13.2f", 
				 		  	 "Name", this.getName(), "Address:", this.getAddress(), "Telephone number:", this.getTelephone(), 
				 		  	 "Customer Number:", this.getCustNum(), "Email notifications:", this.getSignedUp() == true ? "Yes" : "No",
				 		  	 "Purchase amount:", this.getCustomerPurchase());
	}
	
	//ACCESSORS
	/**
	 * getCustomerPurchase, customerPurchase accessor.
	 * @return value in the customerPurchase field, double.
	 */
	public double getCustomerPurchase() { return this.customerPurchase; }
	
	//MUTATORS
	/**
	 * setCustomerPurchase, customerPurchase mutator.
	 * @param purchase -- Double, value to put in the customerPurchase field.
	 */
	public void setCustomerPurchase(double purchase) { this.customerPurchase = purchase; }
}
