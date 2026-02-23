/*

Hierarchy of Java Exception Classes: 
------------------------------------
The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses: Exception and Error. 
The hierarchy of Java Exception classes is given below:

                                Object // object class is the parent class of all the classes
                                  |
                                  |
                               Throwable // Throwable is the child class of Object class and Parent class of Exception and Error.
                                  |
                                  |
                    ---------------------------------
                    |                               |
                Exception                         Error
    

 * What is Exception in Java?
 * Dictionary Meaning: Exception is an abnormal condition.
 * Exceptions mostly occurs by our program.
 * Exceptions are recoverable that mean programmer can handle the exceptions using try catch block.
 * Exceptions never occurs on compile time it occurs only on runtime.
In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

* Exception Handling --->
------------------------
*The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

Types of Java Exception
s
There are mainly two types of exceptions: checked and unchecked. An error is considered as the unchecked exception. 
However, according to Oracle, there are three types of exceptions namely:
1. Checked Exception (Compile time exception)
2. Unchecked Exception (Run time exception)

Error:
Only one type that is Run time or Unchecked exception.

1) Checked Exception (Compile time exception)
----------------------------------------------
I) Checked exceptions are the exceptions that are checked at compile-time. 

II) It means if a method is capable of throwing a checked exception, then the compiler will enforce the calling method to handle that exception
using either try-catch block or by specifying it in the method signature using the throws keyword.

III) The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. 
For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

2) Unchecked Exception (Run time exception)
-------------------------------------------
I) Unchecked exceptions are not checked at compile-time, but they are checked at Runtime and the compiler doesn't force the calling method to handle them explicitly.
II) The classes that inherit the RuntimeException are known as unchecked exceptions. For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
III) It is an under our control so we can correct our code.
eg: Arithmetic,NullPointer,NumberFormat,IndexoutOfBound exception.

3) Error:
Error occurs lack or system resources , not by our program and thus, programer can't do anything.
Error is irrecoverable/beyond our control. 
For example, we are unable to do anything if there occurs VirtualMachineError or StackOverflowError. 
Some example of errors are StackOverflowError,OutOfMemoryError, VirtualMachineError, AssertionError etc.


Keywords : we can handle exceptions using 5 keywords.
----------
1) try:
try	The "try" keyword is used to specify a block where we should place an exception code. 
It means we can't use try block alone. The try block must be followed by either catch or finally.

2) catch:	
The catch block will be executed only in case of exception. otherwise it will skipped.
The "catch" block is used to handle the exception. It catches the exception specified in its parameter and executes the block of code associated with it.
It must be preceded by try block which means we can't use catch block alone. 
It can be followed by finally block later.
We can write multiple catch blocks.

3) finally:	
The "finally" block is used to execute the necessary code of the program. 
It is executed whether an exception is handled or not.
Finally block is always related to the try and catch block in exception handling.
finally block cleans up all the resources used in try block.
finally block is executed as soon as the try-catch block is executed.It's execution is not dependant on the exception.

4) throw: 
The throw keyword is used to explicitly throw an exception. 
It can be used to throw both checked and unchecked exceptions.
throw is used within the method.
We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions..
The throw keyword is followed by an instance of Exception to be thrown.   

5) throws: 
* The throws keyword is used in method declarations. It specifies that there may occur an exception in the method.
* It doesn't throw an exception. It is always used with method signature.
*  We can declare multiple exceptions using throws keyword that can be thrown by the method. For example, main() throws IOException, SQLException
* The Java throws keyword is used to declare an exception.
* The throws keyword is followed by class names of Exceptions to be thrown.
* it gives an information to the programmer that there may occur an exception.
* So, it is better for the programmer to provide the exception handling code so that the normal flow of the program can be maintained.
* If there occurs any unchecked exception such as NullPointerException, it is programmers' fault that he is not checking the code before it being used.

# Finalize:
---------
finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.
finalize() method is used with the objects.
finalize method performs the cleaning activities with respect to the object before its destruction.
finalize method is executed just before the object is destroyed.
*/
package exception_handling;
import java.io.FileInputStream;
public class Exceptions 
{
public static void main(String[] args) 
{
   // Checked Exception (Compile Time)
       // FileInputStream f = new FileInputStream("F:/file.txt"); // shows error unreported exception FileNotFoundException that means it warns us that file not found in future.
       System.out.println("Example of Checked Exception");
        try
        {
            FileInputStream f = new FileInputStream("F:/file.txt");
        }
        catch(Exception e)
        {
            System.out.println("Message: File not found :( \n"+e);
        }


        // Unchecked Exception (Run Time)
        System.out.println("\nExample of Unchecked Exception");
        int a = 20, c;
        int []arr = new int[5]; 

        try
        { 
            System.out.println("1");
            c = a/2; // inside try block jis line me exception aata hai to uske niche waale saare statements skip ho jate hai or exception catch block me chala jata hai.
            System.out.println(c);
            System.out.println("2");
            System.out.println(arr[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("3");
            System.out.println("Message: We can't divide a number by zero\n"+e);
        }
        catch(Exception e1) // make sure that the parent class "Exception" at the bottom of their child claases eg: AritmeticException etc.because Exception class can handle all type of exception.
        {
            System.out.println("4");
            System.out.println("Message: enter correct length for array\n"+e1);
        }
       
        System.out.println("End of code");


        System.out.println("\nExample no.2: ");
        String str = null;
        //System.out.println(str.length()); // showing this error:  java.lang.NullPointerException: Cannot invoke "String.length()" because "<local4>" is null
        try
        {
            System.out.println(str.length());
        }
        catch(NullPointerException n)
        {
        	
            //System.out.println(n); and System.out.println(n.toString()); // this will print only exception name and description message not line no. in which exception occur.
            //System.out.println(n.getMessage()); This will print only description message
           
        	System.out.println("Message: Enter valid String\n"); 
        	n.printStackTrace(); // printStackTrace method will print all details about exception like exception name,description,stacktrace(Line no.) also. and this method is mostly used. 
           
        }
    }

}


