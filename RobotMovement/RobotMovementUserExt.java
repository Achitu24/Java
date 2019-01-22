/*
RobotMovementUserExt
Obtains user input, prints out the results for all three steps
All of three steps' results are stored and printed out 

*/




import java.util.*;

public class RobotMovementUserExt {
	//This is the program's main class
	public static void main (String[] args){
		
		double angle, speed, time;
		double distance, horizontal, vertical;
		double batest;
		
		double totalDistance = 0 ;
		double totalHorizontalMovement = 0;
		double totalVerticalMovement = 0;
		double totalBatteryUsage = 0;
		double totalTimeTravel = 0;
		
		//Scanner object 
		Scanner input = new Scanner(System.in);
		
		
		// Step 1
		
		System.out.print("Input the angle, measured clockwise from the vertical a real number between 0-90: ");
		angle = input.nextDouble();
		System.out.print("Input the speed, as a real number between 1.0 - 5.0: ");
		speed = input.nextDouble();
		System.out.print("Input the time travelled a positive or zero real number: ");
		time = input.nextDouble();
		

		//Creates an object named DS1 of the RobotMovement class
		RobotMovement DS1 = new RobotMovement(angle, speed, time);
		//Process calculations
		distance = DS1.getDistance();
		horizontal = DS1.horizontalDistance();
		vertical = DS1.verticalDistance(); 
		batest = DS1.getBattery();
		
		//This is the output
		System.out.println("\nA robot moving with an angle " + angle + " ,at a speed of " + speed + " ,for " + time + " seconds has ");
		System.out.printf("The distance travelled: %.2f\n", distance);
		System.out.printf("Horizontal movement: %.2f\n" , horizontal);
		System.out.printf("Vertical movement: %.2f\n" , vertical);
		System.out.printf("The estimated battery usage (in idle-battery seconds): %.2f\n", batest);
		
		//Updates the totals for each step
		totalDistance += distance; 
		totalHorizontalMovement += horizontal;
		totalVerticalMovement += vertical;
		totalBatteryUsage += batest;
		totalTimeTravel += time;
		
		
		// Step 2
		
		System.out.print("\n\nInput the angle, measured clockwise from the vertical a real number between 0-90: ");
		angle = input.nextDouble();
		System.out.print("Input the speed, as a real number between 1.0 - 5.0: ");
		speed = input.nextDouble();
		System.out.print("Input the time travelled a positive or zero real number: ");
		time = input.nextDouble();
		

		//Creates an object named DS2 of the RobotMovement class
		RobotMovement DS2 = new RobotMovement(angle, speed, time);
		//Process calculations
		distance = DS2.getDistance();
		horizontal = DS2.horizontalDistance();
		vertical = DS2.verticalDistance(); 
		batest = DS2.getBattery();
		
		//This is the output
		System.out.println("\nA robot moving with an angle " + angle + " ,at a speed of " + speed + " ,for " + time + " seconds has ");
		System.out.printf("The distance travelled: %.2f\n", distance);
		System.out.printf("Horizontal movement: %.2f\n" , horizontal);
		System.out.printf("Vertical movement: %.2f\n" , vertical);
		System.out.printf("The estimated battery usage (in idle-battery seconds): %.2f\n", batest);
		
		//Updates the totals for each step
		totalDistance += distance; 
		totalHorizontalMovement += horizontal;
		totalVerticalMovement += vertical;
		totalBatteryUsage += batest;
		totalTimeTravel += time;


        // Step 3
		
		System.out.print("\n\nInput the angle, measured clockwise from the vertical a real number between 0-90: ");
		angle = input.nextDouble();
		System.out.print("Input the speed, as a real number between 1.0 - 5.0: ");
		speed = input.nextDouble();
		System.out.print("Input the time travelled a positive or zero real number: ");
		time = input.nextDouble();
		

		//Creates an object named DS3 of the RobotMovement class
		RobotMovement DS3 = new RobotMovement(angle, speed, time);
		//Process calculations
		distance = DS3.getDistance();
		horizontal = DS3.horizontalDistance();
		vertical = DS3.verticalDistance(); 
		batest = DS3.getBattery();
		
		//This is the output
		System.out.println("\nA robot moving with an angle " + angle + " ,at a speed of " + speed + " ,for " + time + " seconds has ");
		System.out.printf("The distance travelled: %.2f\n", distance);
		System.out.printf("Horizontal movement: %.2f\n" , horizontal);
		System.out.printf("Vertical movement: %.2f\n" , vertical);
		System.out.printf("The estimated battery usage (in idle-battery seconds): %.2f\n", batest);
		
		//Updates the totals for each step
		totalDistance += distance; 
		totalHorizontalMovement += horizontal; 
		totalVerticalMovement += vertical;
		totalBatteryUsage += batest;	
		totalTimeTravel += time;		
		
		//These are the totals printed out
		System.out.printf("\n\nThe total distance travelled: %.2f\n" , totalDistance);
		System.out.printf("The total horizontal movement: %.2f\n" , totalHorizontalMovement);
		System.out.printf("The total vertical movement: %.2f\n" , totalVerticalMovement);
		System.out.printf("The total battery usage (in idle-battery seconds): %.2f\n" , totalBatteryUsage);
		System.out.printf("The total travel time: %.2f\n" , totalTimeTravel);
		
		
		
		
		
		
	}
	
	
}