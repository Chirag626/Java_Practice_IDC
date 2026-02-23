package exception_handling;
class Throw_throws_usage_at_once
{
  // public static  String str;
    static void show(String str) throws NullPointerException 
    {
      if (str == null)
      {
        throw new NullPointerException("Message : Null is not valid: "); // for NullPointerException there is not need to create class and constructor because it is a Unchecked Exception.
      }
      else
      {
          System.out.println("Name : "+str);    
      }
    }
}


public class Throw_throws 
{
    public static void main(String[] args) {
        /*  here we are calling a method that contains null which is an exception but we are not handling this so that's why rest of the program will terimnated. 
         Throw_throws_usage_at_once.show(null);   */
         
        try
        {
            Throw_throws_usage_at_once.show("Chirag"); //static method can be called by class name directly.
        }
        catch(NullPointerException n)
        {
            System.out.println("Exception handled: \n");
            n.printStackTrace();
        }
        System.out.println("Program Successfully completed...........");
    }
}
