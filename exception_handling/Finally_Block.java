/*
 Java finally block
 ------------------
Java finally block is a block used to execute important code such as closing the connection, etc.
Java finally block is always executed whether an exception is handled or not. 
It contains all the necessary statements that need to be printed regardless of the exception occurs or not.
We can use try catch block also in finally block.
We can use multiple catch block with one try block but we can't use more than one finally block with a try block.

Example: if any exception occur in try block while open,reading or writing a file then the below code will not execute and thus resource will not close..
--------

Why use Java finally block? 
 -----------------------------	
finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
The important statements to be printed can be placed in the finally block.

Note:
-----
we can use finally block owith try catch block only if we separately write finally block it will not execute.

Syntax:  we will prefer first one.bcz if exception occur then we must handle this.

1) try 							 or   2)     try
  {										{
	// RiskyCode							  //code	
	//file open,read,write				 }
	}										
	catch() {							finally {
	//Handling Code									//code
		}										}
	finally
	{
		//CleanUp Code
		//close file..
		}
	
		
The possibilities that disturbs the execution of finally Block:
---------------------------------------------------------------
1) Using of the System.exit() method.
2) Causing a fatal error that causes the process to abort like, OutOfMemoryError.
3) If any exception occur inside the finally Block and we aren't handlig it.
4) If any thread terminates in between the process.(Death of Thread)	
	
 */

// Case 1) When an Exception does not occur.
package exception_handling;
class Finally_Case_1
{
	void display()
	{
	String name;
	
	try 
	{
		name = "Chirag";
		System.out.println("My Name is: "+name);
	}
	catch(Exception e)
	{
		System.out.println("Message1 : write correct string...");
		e.printStackTrace();
	}
	finally
	{
		System.out.println("finally block is executing in Case1.......");
	}
}
}
	
// Case 2) When an Exception Occur and Handled by Catch Block.
class Finally_Case_2
	{
		int a = 20; int b;
		void display()
		{
			try {
			b = a/0;
			System.out.println(b);
			}
			catch(Exception e1)
			{
				System.out.println("\nMessage2 : Exception Handled Successfully");
				e1.printStackTrace();
			}
			finally
			{
				System.out.println("finally block is executing in Case2.......");
			}
		}
		
// Case 3) When Exception occur and not Handled by catch block...
		void show()
		{
			String str;
			
			try
			{
				str = null;
				System.out.println(str.length());
			}
			catch(ArithmeticException e2) // Here Exception are not handled...
			{
				e2.printStackTrace();
			}
			
			finally
			{
				System.out.println("\nMessage3 : Execption occur but not handled so, the finally block is executing.....");
			}
		}
	}


public class Finally_Block
{
	public static void main(String[] args) 
	{
		Finally_Case_1 f = new Finally_Case_1();
		f.display();
		
		Finally_Case_2 f1 = new Finally_Case_2();
		f1.display();
		
		// Case3
		f1.show();
				
	}

}

