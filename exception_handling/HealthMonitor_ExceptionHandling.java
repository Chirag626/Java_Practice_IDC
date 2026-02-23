package exception_handling;
import java.util.Scanner;
class PatientInformation
{
	Scanner sc = new Scanner(System.in);
	
	void PatientInfo() throws InvalidInputException
	{
	try
	{
		System.out.println("Enter patient name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		
		if(age<=0)
		{
			throw new InvalidInputException("Age should not be negative: ");
		}
	}
	catch(InvalidInputException e)
	{	
		e.printStackTrace();
	}
	finally
	{
		System.out.println("Patient information is processed.....\n");
	}
	}
	
	void Health_Details() throws BloodPressureException,HeartAndTempratureException
	{
		System.out.println("Now Enter Patient's Health Details: ");
		try
		{
//			// Checking the temprature
			System.out.println("Enter Temprature: ");
		    double Temprature = sc.nextDouble();
		    try
		    {
		    if(Temprature < 35.0 || Temprature > 42.0)
		    {
		    	throw new HeartAndTempratureException("Temprature value should be in between 35.0 to 42.0 ");
		    }
			}
			catch(HeartAndTempratureException t1) 
			{
				System.out.println(t1);
			}
		    
		    // Checking HeartRate...
		    System.out.println("Enter HeartRate: ");
		    try
		    {
		    int heartRate = sc.nextInt();
		    if(heartRate < 40 || heartRate>200)
		    {
		    	throw new HeartAndTempratureException("Heart Rate value between 40 and 200");
		    }
		    }
		    catch(HeartAndTempratureException t1) 
			{
				System.out.println(t1);
			}
		    
		    // Checking Blood Pressure....
			try
			{
		System.out.println("Enter Systolic Blood Pressure: ");
		int SystolicBloodPressure = sc.nextInt();
		if(SystolicBloodPressure <= 60 ||SystolicBloodPressure >=220)
		{
			throw new BloodPressureException("The Range should be between 60 and 220 for SystolicBloodpressure: ");
			} 
		// if here exception occur then it will directly jump to the catch block hence the remaining code will not exectue. bcz we are not using try catch block seperately...
		
		System.out.println("Enter Diastolic Blood Pressure: ");
		int DiastolicBloodPressure = sc. nextInt();
		if(SystolicBloodPressure < 40 ||SystolicBloodPressure >130)
		{
			throw new BloodPressureException("The Range should be between 40 and 130 for SystolicBloodpressure: ");
			}
			}
			catch(BloodPressureException BP)
			{
				BP.printStackTrace();
			}
		System.out.println("Processing Patient Data.......");
		System.out.println("Data Processed Successfully: ");
		}
		
		
catch(Exception E)
		{
		System.out.println("An Unexpected Exception Occur: Please Enter valid Data ");
		E.printStackTrace();
		}
		finally
		{
			sc.close();
		}
}
}
class InvalidInputException extends Exception
{
	public InvalidInputException(String msg)
	{
		super(msg);
	}
}

class BloodPressureException extends RuntimeException
{
	BloodPressureException(String Message)
	{
		super(Message);
	}
}

class HeartAndTempratureException extends Exception
{
	public HeartAndTempratureException(String Msg)
	{
		super(Msg);
	}
}

public class HealthMonitor_ExceptionHandling
{
	public static void main(String[] args) 
	{
		PatientInformation P = new PatientInformation();
		try 
		{
			P.PatientInfo();
			P.Health_Details();
		}
		catch (InvalidInputException e)
		{
			e.printStackTrace();
		}
		catch ( HeartAndTempratureException e)  // Ya to hum direct method ke andar hi exception ko handle karlein ya fir main method ke andar baat ek hi hai.
		{
			e.printStackTrace();
		}

		System.out.println("Program Successfully Executed........");
	}
}
