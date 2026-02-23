// There are two cases to handle the exception: By using Try Catch and by declarin throws.

/* Case 1: Handle Exception Using try-catch block
   ----------------------------------------------
In case we handle the exception, the code will be executed fine whether exception occurs during the program or not.
*/
//
//import java.io.*;  
//class M
//{  
// void method()throws IOException
// {  
//  throw new IOException("device error");  
// }  
//} 
//
//public class Throws_Cases
//{  
//   public static void main(String args[])
//   {  
//    try
//    {  
//     M m=new M();  
//     m.method();  
//    }
//    catch(Exception e)
//    {
//    	System.out.println("exception handled");
//    	}     
//    System.out.println("normal flow...");  
//  }  
//}  



/* Case 2: Declare Exception
 ----------------------------
In case we declare the exception, if exception does not occur, the code will be executed fine.
In case we declare the exception and the exception occurs, it will be thrown at runtime because throws does not handle the exception.
*/

/*  A) If exception does not occur:
 ----------------------------------
 
import java.io.*;  
class M
{  
 void method()throws IOException
 {  
  System.out.println("device operation performed");  
 }  
}  
class Throws_Cases
{  
//declare exception and handled by default exception handler,but here it works because in our program there is no exception occur so that's why the flow of our program will not break.
   public static void main(String args[]) throws IOException 
   {  
     M m=new M();  
     m.method();  
    System.out.println("normal flow successfully runs....");  // here it prints because exception is not occurs.. 
  }  
}  
*/


// B) If exception occurs
//-----------------------
package exception_handling;
import java.io.*;  
class M
{  
 void method()throws IOException
 {  
  throw new IOException("device error");  
 }  
}  
class Throws_Cases
{  
// it will disrupts the flow of program so instead of using "throws" here we will use "try and catch" and handle the exception so that the flow of our program will not break.
   public static void main(String args[]) throws IOException  
   { 
     M m=new M();  
     m.method();  
    System.out.println("normal flow...");   // this will not print because we are not handle the exception here.
  }  
}  
