/* CarpetCostUser
 * Obtains user input, prints out the result
 * All of three steps' results are stored and printed out 
*/

import java.util.*;

public class CarpetCostUser {
	
	//This is the program's main class
	public static void main (String[] args){
		double length, width;
		double floorArea, carpetCost, labourCharge, costbfVAT, vat, totalCost;
	
		//Creates scanner object
		Scanner input = new Scanner(System.in);
		
		//Asks the user for input and stores it into a variable
		System.out.print("Please enter the apartment length (in metres): ");
		length = input.nextDouble();
		System.out.print("Please enter the apartment width (in metres): ");
		width = input.nextDouble();
		
		//Creates the object CPT of the CarpetCost class
		CarpetCost CPT = new CarpetCost(length, width);
		
		CPT.setCarpetType(0);
		floorArea = CPT.carpetArea();
		carpetCost = CPT.carpetAreaCost();
		labourCharge = CPT.labourCharge();
		costbfVAT = CPT.costBeforeVAT();
		vat = CPT.vat();
		totalCost = CPT.totalCost(); 
		
		System.out.printf("\n\nThe floor area of the apartment is: %.2f\n", floorArea);
	
		//This is is the output 
		System.out.printf("The carpet cost is: %.2f\n", carpetCost);
		System.out.printf("The labour service charge is: %.2f\n", labourCharge);
		System.out.printf("The cost before VAT is: %.2f\n", costbfVAT);
		System.out.printf("The VAT charged is: %.2f\n", vat);
		System.out.printf("The total cost (including VAT) is: %.2f\n", totalCost);
	
	}
}