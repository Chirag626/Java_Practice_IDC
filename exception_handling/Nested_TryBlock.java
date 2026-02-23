/*  Java Nested try block
 ------------------------
In Java, using a try block inside another try block is permitted. It is called as nested try block. 
Every statement that we enter a statement in try block, context of that exception is pushed onto the stack.
 
For example, the inner try block can be used to handle ArrayIndexOutOfBoundsException while the outer try block can handle the ArithemeticException (division by zero).

 * Why use nested try block
Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. In such cases, exception handlers have to be nested.
 
 * Syntax: 
 //main try block  
try    
{    
    statement 1;    
    statement 2;    
//try catch block within another try block  
    try    
    {    
        statement 3;    
        statement 4;    
//try catch block within nested try block  
        try    
        {    
            statement 5;    
            statement 6;    
     }    
        catch(Exception e2)    
        {    
//exception message  
        }    
  
    }    
    catch(Exception e1)    
    {    
//exception message  
    }    
}    
//catch block of parent (outer) try block  
catch(Exception e3)    
{    
//exception message  
}    
....
 */
package exception_handling;

import java.util.Scanner;

public class Nested_TryBlock 
{
	public static void main(String[] args) 
	{
		int a = 10, b = 0,c ;

		int array[] = new int[5];
		array[0] = 100;
		array[1] = 200;
		array[2] = 300;
		array[3] = 400;
		array[4] = 500;
		
		Scanner sc = new Scanner(System.in);
		
		try	  // Outer try block
		{
			System.out.println("Inner Block 1");
			try	// Inner try block 1
			{
				c = a/b;
				System.out.println("Result: "+c);
				
			}
			catch(ArithmeticException I1)
			{
				System.out.println("Message: can't divide by zero: \n " + I1);
				
			}
			
			System.out.println("Inner block 2");
			System.out.println("Enter index Number: ");
			int index = sc.nextInt();
			try // Inner try block 2
			{
				for(int i = 0; i<=index; i++)
				{
					System.out.println(array[i]+" is present at index["+i+"]");
				}
				
			}
			catch(ArrayIndexOutOfBoundsException I2)
			{
				System.out.println("Message : Sorry The index no."+index+" doesn't exist...");
				I2.printStackTrace(); // this will print all information about exception like exception name,DescriptionMessage,location(in which line exception occur).
			}
		}
	
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(".........End of Program.....");
		sc.close();
	}
}
