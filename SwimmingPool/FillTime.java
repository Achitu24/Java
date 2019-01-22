public class FillTime{
	
	private static final double INFLOW = 50.0; // Litres/minute 
	private double volume;

	
	FillTime (double v){
		volume = v;
	}
	
	public double getTime(){
		return (volume / (INFLOW/1000)) /60 ; 
	}
	
}