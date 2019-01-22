


public class TunnelTollChargeUser{
	
	//This is the program's main class
	public static void main (String[] args){
	
		
		//Creates the object toll of the TunnelToll class
		TunnelToll toll = new TunnelToll();
		
		/*Calls methiods for asking questions, deciding which vehicle type is it 
		the cost, and printing all the resultts*/
		toll.question();
		toll.getVehicleClass();
		toll.printStrings();
		
		
		
	}
}
	
