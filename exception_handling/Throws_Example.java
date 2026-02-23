//Point to remember:  Throws can be work only with Checked (compile time) exception...
package exception_handling;
class Find_Javaclass

{
	void notfind() throws ClassNotFoundException
	{
		Class.forName("Stack");
	}

	
	void found()
	{
		try
		{
		Class.forName("Exceptions54");
		System.out.println("Class Founded Successfully....");
		}
		catch(ClassNotFoundException c2)
		{
			System.out.println("Class Not Found....\n"+c2);
			
		}
	}
}
public class Throws_Example
{
/* we will run like this ,but here we are saying to the JVM to handle the exception then the JVM stop the execution. bcz the JVM tell the  default exceptionhandler to handle the exception but it can't handle the program properly if exception occur.
//public static void main(String[] args) throws ClassNotFoundException */ //it's not a good approach to handle the exception by throws the exception to the main method.
	public static void main(String[] args) 
	{
		Find_Javaclass obj = new Find_Javaclass();
		
		try
		{
		obj.notfind(); // here we handle the exception
		}
		catch(ClassNotFoundException c1)
		{
			System.out.println("Class Not Found.....");
			c1.printStackTrace();
		}
		
// if we are not handle the exception inside the method we simply throws the exception and handle here...
		obj.found();
		System.out.println("Program Successfully Completed......"); 
	}
}
