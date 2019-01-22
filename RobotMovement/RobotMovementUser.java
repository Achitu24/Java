/*
RobotMovementUser
Obtains user input and prints out the results 

*/



import java.util.*;

public class RobotMovementUser {
	//This is the program's main class 
	public static void main (String[] args){
		
		double angle, speed, time;
		double distance, horizontal, vertical;
		double batest;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the angle, measured clockwise from the vertical a real number between 0-90: ");
		angle = input.nextDouble();
		System.out.print("Input the speed, as a real number between 1.0 - 5.0: ");
		speed = input.nextDouble();
		System.out.print("Input the time travelled a positive or zero real number: ");
		time = input.nextDouble();
		
		//Creates an object of the RobotMovement class 
		RobotMovement DS1 = new RobotMovement(angle, speed, time);
		//Process the calculations
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
		
	}
	
}