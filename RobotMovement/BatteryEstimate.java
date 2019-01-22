public class BatteryEstimate {
	double speed;
	double time;
	final double CONSTANT = 3.7;
	
	
	public BatteryEstimate(double t, double s) {
		speed = s;
		time = t;
		}
	
	public double getBattery() {
		return time * Math.pow(speed,2) * CONSTANT;
		}

}