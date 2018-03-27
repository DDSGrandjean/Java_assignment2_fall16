/**
 * Assignment 2
 * 
 * September 28th, 2016
 * @author Dylan Grandjean
 *
 * Class destined to extend Person class
 * allowing a customer to sign up for a 
 * mailing list.
 */
public class Customer extends Person 
{
	//Fields:
	private int custNum;
	private boolean signedUp;
	
	//Methods:
	//CONSTRUCTORS
	/**
	 * Customer, no-arg constructor.
	 * Initialize all fields to their default values.
	 */
	public Customer()
	{
		super();
		this.custNum = 0;
		this.signedUp = false;
	}
	
	/**
	 * Customer, copy constructor.
	 * @param customer -- A Customer object to copy into the current object.
	 */
	public Customer(Customer toCopy)
	{
		super(toCopy);
		this.custNum = toCopy.custNum;
		this.signedUp = toCopy.signedUp;
	}
	
	/**
	 * Customer, constructor which assigned a value to all of the object's fields.
	 * @param n -- String, value to put in the name field.
	 * @param add -- String, value to put in the address field.
	 * @param num -- String, value to put in the telephone field.
	 * @param number -- Int, value to put in the custNum field.
	 * @param mail -- Boolean, value to put in the signedUp field.
	 */
	public Customer(String n, String add, String num, int number, boolean mail)
	{
		super(n, add, num);
		this.custNum = number;
		this.signedUp = mail;
	}
	
	//ACCESSORS
	/**
	 * getCustNum, custNum field accessor.
	 * @return value in the custNum field, int.
	 */
	public int getCustNum() { return this.custNum; }
	
	/**
	 * getSignedUp, sgnedUp field accessor.
	 * @return value int the signedUp field, boolean.
	 */
	public boolean getSignedUp() { return this.signedUp; }
	
	//MUTATORS
	/**
	 * setCustNum, custNum field mutator.
	 * @param num -- Int, value to put in the custNum field.
	 */
	public void setCustNum(int num) { this.custNum = num; }
	
	/**
	 * setSignedUp, signedUp field mutator.
	 * @param mail -- Boolean, value to put in the signedUp field.
	 */
	public void setSignedUp(boolean mail) { this.signedUp = mail; }
	
	//OTHER METHODS
	
	/**
	* toString, return a String representing the fields of the object.
	*/
	public String toString()
	{
		return String.format("%-25s%-15s\n%-25s%-15s\n%-25s%-15s\n%-25s%-15d\n%-25s%-15s\n", 
							 "Name", this.getName(), "Address:", this.getAddress(), "Telephone number:", this.getTelephone(), 
							 "Customer Number:", this.getCustNum(), "Email notifications:", this.getSignedUp() == true ? "Yes" : "No");
	}
}
