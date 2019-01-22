import java.util.*;

public class SwimmingPoolUser {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the width: ");
		double width = input.nextDouble();
		System.out.println("Please input the height: ");
		double height = input.nextDouble();
		System.out.println("Please input the length: ");
		double length = input.nextDouble();
		
		SwimmingPool SW = new SwimmingPool(width, height, length);
		double res = SW.Filltime();
		
		System.out.println("The fill time is:" + res);
		
		
		
	}
	
	
}

