import java.util.*;

public class CostOfFuel {
	public static void main (String[] args){
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Please type in your Monday cost :");
		double mondayFuelCost = Input.nextDouble();
		System.out.println("Please type in your Tuesday cost :");
		double tuesdayFuelCost = Input.nextDouble();
		System.out.println("Please type in your Wednesday cost :");
		double wednesdayFuelCost = Input.nextDouble();
		System.out.println("Please type in your Thursday cost :");
		double thursdayFuelCost = Input.nextDouble();
		System.out.println("Please type in your Friday cost: ");
		double fridayFuelCost = Input.nextDouble();
		
		
		Calculations Cost = new Calculations(mondayFuelCost, tuesdayFuelCost, wednesdayFuelCost, 
																						 thursdayFuelCost, fridayFuelCost);
			double total = Cost.getTotalCost();
			double average = Cost.getAverageCost();
			
			System.out.println("Your total cost is: "+ total + " Pounds");
			System.out.println("Your average cost is: " + average + " Pounds");
			
		
		
		
	}
	
}
