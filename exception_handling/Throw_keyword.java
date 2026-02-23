package exception_handling;
import java.util.Scanner;
/*
 * throw: 
 -----------
* The throws keyword is used in method declarations. It specifies that there may occur an exception in the method.
* It doesn't throw an exception. It is always used with method signature.
* We can declare multiple exceptions using throws keyword that can be thrown by the method. For example, main() throws IOException, SQLException
* The Java throws keyword is used to declare an exception.
* The throws keyword is followed by class names of Exceptions to be thrown.
* it gives an information to the programmer that there may occur an exception.
* So, it is better for the programmer to provide the exception handling code so that the normal flow of the program can be maintained.
* If there occurs any unchecked exception such as NullPointerException, it is programmers' fault that he is not checking the code before it being used.
* throw keyword is used for user defined/custom exception.
*/

 //For checked custom exception we will use Class A extends Exception { }

 //For unchecked Custom exception we will use:
 class VotingException extends RuntimeException
 {
   public  VotingException(String msg)
    {
        super(msg); // this super(msg) is available for default exception handler.
    }
 }

public class Throw_keyword 
{
    public static void main(String[] args) 
    {
        Throw_keyword obj1 = new Throw_keyword();
        obj1.show();

        System.out.println("End Program");
        /* if we are not handling the exception  in show() method then we can handle the  exception here. like this
        try
        {
            obj1.show();
        }
        catch(Exception e)
        {
            e.printStackTrace(); // This will print exception name, description message,location where exeception occur.
        }

        */
    }

    void show()
    {
        int a = 10,b = 0,c;
        
        try
        {
            c = a/b;
            System.out.println("result: "+c);
        }
        catch(ArithmeticException exp)
        {
            System.out.println("Message: Can't divide by 0\n"+exp.toString());
        }
// if we are not hadle the exception then in will handle by default exception handler.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        try
        {   
            if(age<18)
            {
                throw new VotingException("You are not eligible for vote"); // this message will pass to super(msg) and thend super(msg) to default exception handler.
               
               // System.out.println("New Statement"); //we can not write any statement.logic after throw statement,
            }
            else
            {
                System.out.println("You are eligible for voting.");
            }
        }
        catch (VotingException e1)
        {
            e1.printStackTrace();
        }
    }
}

