/* TunnelToll calculations 
 * Receives the user input and calculates the cost for every class
 */




import java.util.*;

public class TunnelToll {
	
	// Stores user inputted values
	int vehicleClass;
	int wheels = 0;
	double length = 0;
	int axles = 0;
	double weight = 0;
	boolean weekday;
	
	//Constant for each class
	final double CLASS1 = 2.00;
	final double CLASS2 = 3.20;
	final double CLASS3 = 3.80;
	final double CLASS4 = 4.40;
	final double CLASS5 = 8.00;
	final double CLASS6 = 12.00;
	final double UNKNOWN_CLASS = 4.0;
	
	
	Scanner input ;
	
	// Constructor links the classes TunnelToll and TunnelTollUser
	TunnelToll(){	
		input = new Scanner(System.in);
	}
	

		public void getVehicleClass(){
		
			// ask for the travel (weekend or weekday)
			weekday = travelPeriod();
			
			if (wheels  < 4) {
				vehicleClass = 1; 
			}
			else if (wheels == 4 && length <= 15 ){
				vehicleClass = 2;
			}
			else if (wheels == 4 && length > 15){
				vehicleClass = 4;
			}else if (length > 15){
				
				if (wheels >= 4 && weight > 3.5 ){
					vehicleClass = 6;
				}		
				else if (wheels > 4 && weight <= 2){
					vehicleClass = 3;
				}	
				else if ( wheels > 4 && weight > 1 && weight <= 3.5  ) {
					vehicleClass = 5;	 	
				}
				
			}
			
		} 
	
	
		//Returns tunnel fee depending on the park of the week
		public double getTunnelFee(){
			double tunnelFee = 0;
				if (vehicleClass == 1)
					tunnelFee = CLASS1;
				if (vehicleClass == 2)
					tunnelFee = CLASS2;
				if (vehicleClass == 3)
					tunnelFee = CLASS3;
				if (vehicleClass == 4)
					tunnelFee = CLASS4;
				if (vehicleClass == 5)
					tunnelFee = CLASS5;
				if (vehicleClass == 6)
					tunnelFee = CLASS6;
				if (vehicleClass == 0)
					tunnelFee = UNKNOWN_CLASS;
				
				if( !weekday )
					tunnelFee = tunnelFee * 0.75;
				return tunnelFee;
			}
	
		//Reutrns depending on the vehicle class the specific name
		public String getVehicleType(){
			String type = "";
			if (vehicleClass == 1)
				type = "Motorbike";
			if (vehicleClass == 2)
				type = "Car";
			if (vehicleClass == 3)
				type = "Car with a trailer";
			if (vehicleClass == 4)
				type = "Van";
			if (vehicleClass == 5)
				type = "Small lorry/Bus";
			if (vehicleClass == 6)
				type = "Large Lorry";
			if (vehicleClass == 0)
				type = "Unspecified vehicle";
				
			return type;
			}
	
		//Validating the user input which is an integer
		public int validateInteger(String s){
			int n = 0;
				while ( n < 2 ) {
					System.out.printf("Please enter the %s (a number greater or equal than 2): ", s);
					n = input.nextInt();
				}
			return n;
		}
		
		//Validate user input which is a double
		public double validateDouble(String s){
			double n = 0;
				while ( n < 2 ) {
					System.out.printf("Please enter the %s (a number greater or equal than 2): ", s);
					n = input.nextDouble();
				}
			return n;
		}
	
		//Asks the user to input the aprt of the week
		public boolean travelPeriod(){
			System.out.print("Input true if travelling on a weekday (Mon-Fri) and false otherwise: ");
			boolean n = input.nextBoolean();
			return n;
		}
	
	
		//Asking questions depending on the number of wheels, length, axles and weight
		public void question(){
		
	
			wheels = validateInteger(" number of wheels");
			if (wheels  < 4) {
				return;
			}
			else{
				
				length = validateDouble("length");
				if (length <= 15){
					return;
				}
				if (wheels != 4 && length > 15){
					axles = validateInteger("number of axles");
					weight = validateDouble("weight");
					return;
				}
				
			}

		}
		
		//Prints the results calling variables from ano
		public void printStrings(){
		
			String partOfWeek = "weekend";
			
			if(weekday){
				partOfWeek = "weekday";
			}
			
			
			if (vehicleClass == 1){
				System.out.printf("\nWheels: %d, %s", wheels, partOfWeek);
			}
			else if (vehicleClass == 2 || vehicleClass == 4){
				System.out.printf("\nWheels: %d, Lenght: %.2f, %s", wheels, length ,partOfWeek);
			}
			else if (vehicleClass == 3 || vehicleClass == 5 || vehicleClass == 6){
				System.out.printf("\nWheels: %d, Lenght: %.2f, Axles: %d, Weight: %.2f, %s", wheels, length ,axles, weight, partOfWeek);
			}
			else if 
			
			
			
		
			System.out.printf("\nVehicle class: %d", vehicleClass );
			System.out.printf("\nVehicle type: %s", getVehicleType() );
			System.out.printf("\nVehicle charge: %.2f", getTunnelFee() );
		
		} 
		
	
	
}
	