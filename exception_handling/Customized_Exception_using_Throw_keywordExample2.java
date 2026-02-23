package exception_handling;
class Shopping
{
	private static final int Max_quantity = 10;
	
	void addItem(String item_name,int quantity) throws QuantityOutOfException // for custom exceptions there is mandatory to create a class and constructor.
	{
		try
		{
			if(quantity <= 0 || quantity > Max_quantity) 
			{
				throw new QuantityOutOfException("Message : Quantity must be in between "+ Max_quantity);
			}
			else
			{
				System.out.println("Item Added: "+item_name+" "+quantity);
			}
		}
		catch(QuantityOutOfException q1)
		{
			q1.printStackTrace();
		}
		System.out.println("Program Ended.......");
	}
}
//class QuatityOutOfException extends Exception // to convert customized exception into Checked(Compile time) exception category.
							// -----------------								
@SuppressWarnings("serial")
class QuantityOutOfException extends RuntimeException // we will declare our customized exception in runtime(unchecked) exception category.
{
	public QuantityOutOfException(String Msg) 
	{
		super(Msg);
	}
	
}
public class Customized_Exception_using_Throw_keywordExample2 {

	public static void main(String[] args) 
	{
		Shopping s = new Shopping();
		
		s.addItem("Toothpaste", 2);
	}

}
