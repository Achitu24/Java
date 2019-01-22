public class Distances {
	double angle;
	double speed;
	double time;
	
	
	
	public Distances(double a, double s, double t){ 
	angle =Math.toRadians(a);
	speed = s;
	time = t;
}

   public double getDistance() {
	   return speed*time;
   }
	
	public double horizontalDistance() {
		return getDistance() * Math.sin(angle) ;
		
	}
	
	public double verticalDistance() {
		return getDistance() * Math.cos(angle);
	}
	
	
	
	
}