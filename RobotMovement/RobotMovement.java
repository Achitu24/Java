/*
RobotMovement
Receives the user input and calculates the distance, horizontal and verticla distance
and estimated battery usage

*/


public class RobotMovement {
	
	
	// Stores user inputted values
	double angle, speed, time;
	// Constant for the battery estimate calculation 
	final double CONSTANT = 3.7;
	
	// Constructor links the classes RobotMovement and RobotMovementUser
	public RobotMovement(double a, double s, double t){ 
		angle =Math.toRadians(a);
		speed = s;
		time = t;
	}

	// Returns the calculated distance
	public double getDistance() {
	   return speed*time;
	}
	
	//Return the calculated horizontal distance
	public double horizontalDistance() {
		return getDistance() * Math.sin(angle) ;
		
	}
	
	//Returns the calculated vertical distance
	public double verticalDistance() {
		return getDistance() * Math.cos(angle);
	}
	
	//Returns the calculated vertical distance
	public double getBattery() {
		return time * Math.pow(speed,2) * CONSTANT;
	}
	
	
	
	
}