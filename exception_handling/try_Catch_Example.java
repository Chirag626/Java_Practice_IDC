package exception_handling;
import java.util.Scanner;

public class try_Catch_Example
{
    public static void main(String[] args) 
    {
        int a = 10, b = 2, c;

        int array[] = new int[5];
        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;

        Scanner sc = new Scanner(System.in);

        // Use while loop for array program
        boolean flag = true;
        while (flag)
        {
            System.out.println("Enter Correct index Number: ");
            int index = sc.nextInt();

            try
            {
                
                System.out.println(array[index]);
                flag = false;
            }
            catch (ArrayIndexOutOfBoundsException I2)
            {
                System.out.println("Message : Sorry, The index no. " + index + " doesn't exist...");
                I2.printStackTrace();
            }
        }

        System.out.println(".........End of Program.....");
    }
}
