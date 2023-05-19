package week1.day2;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args)
	{
		
		int number= -20;
				
		if (number>=0)
		{
		System.out.println("The entered number is not an negative number");
		}
		else
		{
		number = number * (-1);
		System.out.println("The number changed to positive number:"+ number);
		}
		}
		

	}


