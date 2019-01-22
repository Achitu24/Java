public class Calculations {

  private static double mondayCost;
  private static double tuesdayCost;
  private static double wednesdayCost;
  private static double thursdayCost;
  private static double fridayCost;
  private static double totalCost;
  
  
   Calculations (double mon, double tue, double wed, double thu, double fri) {
		mondayCost = mon;
		tuesdayCost = tue;
		wednesdayCost = wed;
		thursdayCost = thu;
		fridayCost = fri;
		totalCost = mondayCost+tuesdayCost+wednesdayCost+thursdayCost+fridayCost;
	
	}
						
						
	public double getTotalCost(){
		return totalCost;
	}
	public double getAverageCost() {
		return totalCost / 5;
	}

	
  }