/*
 Java throws keyword
 -------------------
The Java throws keyword is used to declare an exception,and It is only used with checked Exceptions(Compile time) eg: IOException.
It gives an information to the programmer(caller method) that there may occur an exception. 
So, it is better for the programmer(caller method) to provide the exception handling code so that the normal flow of the program can be maintained.

Exception Handling is mainly used to handle the checked exceptions. 
If there occurs any unchecked exception such as NullPointerException, it is programmers' fault that he is not checking the code before it being use

Syntax: // throws keyword will used with methods.
-------
return_type method_name() throws exception_class_name
{  
//method code  
}  

Which exception should be declared?
-----------------------------------
Ans: Checked exception only, because:

unchecked exception: under our control so we can correct our code.
error: beyond our control. For example, we are unable to do anything if there occurs VirtualMachineError or StackOverflowError.

Advantage of Java throws keyword:
---------------------------------
Now Checked Exception can be propagated (forwarded in call stack).
It provides information to the caller of the method about the exception.

Note: We Can re-throw and exception by throwing same exception in catch block.

If a method throws a checked exception (exceptions that are subclasses of java.lang.Exception), 
but it is not handled using a try-catch block or declared using throws keyword, 
you will get a compile-time error saying "unreported exception must be caught or declared to be thrown".

To prevent this compile time error we can handle the exception in two ways:
Case 1: We have caught the exception i.e. we have handled the exception using "try/catch block."
Case 2: We have declared the exception i.e. specified "throws keyword with the method."
 */
package exception_handling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

//Case1: Exception not
class File
{
	void readFile() throws FileNotFoundException
	{
		FileInputStream Is = new FileInputStream("C:\\Users\\asus\\Desktop\\File1.txt");
	}
	
//Case2: Exception occur
	void saveFile() throws FileNotFoundException
	{
		FileOutputStream Os = new FileOutputStream("F:\\abc.txt");
		//FileOutputStream Os = new FileOutputStream("C:\\Users\\asus\\Desktop\\File1.txt");//Successfull run
		
	}
}

public class Throws_keyword 
{
	// we should ignore to pass throws keyword in main method because we don't want that our exception is handled by jvm default execption handler.
	//public static void main(String[] args) throws FileNotFoundException // not safe because here our exception is handled by default exception handler and thus the JVM terminates the program and it also breaks the flow of our program.
	public static void main(String[] args) 
	{
		File F = new File();
		
		// Method1
		try
		{
		F.readFile(); // to avoid the problem we will handle our exception here by using try catch...
		System.out.println("File Founded....");
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Method1 File nahi mili..");
			e.printStackTrace();
		}
		
		// Method 2 : // to avoid the problem we will handle our exception here by using try catch...
		try 
		{
			F.saveFile();
			System.out.println("File Saved Successfully....");
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Method2 File not found and Saved....");
			e.printStackTrace();
		} 
		
		System.out.println("Program ended.....");
	}
}
