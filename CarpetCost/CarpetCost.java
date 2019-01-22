/* Carpet Cost calculations 
 * Receives the user input and calculates the carpet cost, floor area, carpet area cost,
 labour charge, cost before VAT, VAT and total cost.
 */

public class CarpetCost{
	// Stores user inputted values
	private double length, width;
	//Constants
	final double VATCT = 0.2;

	
	// Constructor links the classes CarpetCost and CarpetCostUser
	public CarpetCost(double l, double w){
		length = l;
		width = w;
	}
	
	//Returns area of the carpet	
	public double carpetArea(){
		return length * width;
	}
	
	//Returns carpet area cost for each type of carpet
	public double carpetAreaCost(){
		return carpetArea() * 4.75;
	}	
	
	//returns labour charge depending on the area
	public double labourCharge(){
		if (carpetArea() <= 100)  
			return 16.50 + (carpetArea()/4);
		else 
			return 18.15 + 1.1 * (carpetArea()/4);
	}
	
	//returns cost before VAT
	public double costBeforeVAT(){
		return carpetAreaCost() + labourCharge();
	}

	//returns VAT
	public double vat(){
		return costBeforeVAT() * VATCT;
	}
	
	//returns total cost
	public double totalCost(){
		return costBeforeVAT() + vat();
	}
	
	
	
	
	
}
