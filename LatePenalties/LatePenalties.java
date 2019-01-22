/* TunnelToll calculations 
 * Receives the user input and calculates the cost for every class
 */




import java.util.*;

public class LatePenalties {
	
	int loopCounter = 0;
	

		Scanner input;
		
		
		LatePenalties(){
		 input = new Scanner(System.in);
			}

			public int getMark() {
			int mark = 0;
				do {
					System.out.println("Please enter the mark");
					while (!input.hasNextInt()) {
						input.nextLine(); // Clears the invalid input
						System.out.println("Please enter the mark");
					}
					mark = input.nextInt();
				} while (!(mark >= 0  && mark <= 100 ));

				return mark;
					
			}
	
			
			public int getDayNumber() {
			int day = 0;
				do {
					System.out.println("Please enter the number of days");
					while (!input.hasNextInt()) {
						input.nextLine(); // Clears the invalid input
						System.out.println("Please enter the number of days");
					}
					day = input.nextInt();
				} while (!(day >= 0  && day <= 20 ));

				return day;
					
			}
			
	
			
			public  int Scheme1(){
				
				if (loopCounter == 0)
				System.out.printf( "Scheme 1");
				System.out.printf( "(" + loopCounter + ")" , mark);
					do {
				loopCounter++;
				System.out.printf( "(" + loopCounter + ")" , mark -(5*loopCounter) );
				
				} while (loopCounter <= day);
				
				return;
				
			}
			

}