public class Volume {
   	double width;
   	double height;
   	double length;
	

	
	
	Volume(double w, double l, double h){
		
		width = w;
		length = l;
		height = h; 
	}
	
	public double getVolume(){
		return width * length * height;
	}
}