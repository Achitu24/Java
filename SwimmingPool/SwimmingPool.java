public class SwimmingPool {
double width;
double height;
double length;

public SwimmingPool(double w, double h, double l){
width = w;
height = h;
length = l;
}

public double getVolume() {
	return width* height * length;
}
public double Filltime() {
	
	double vol = getVolume();
	return ((vol * 1000.00) / 50.00)/60.00;
}




}