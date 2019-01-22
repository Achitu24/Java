import java.util.*;

public class Pool {
	public static void main (String[] args){
		Scanner Input = new Scanner (System.in);
		
		System.out.println(" Please enter pool width: ");
		double poolWidth = Input.nextDouble();
		System.out.println(" Please enter pool length: ");
		double poolLength = Input.nextDouble();
		System.out.println(" Please enter pool Height: ");
		double poolHeight = Input.nextDouble();
		
		
		Volume PoolVolume = new Volume(poolWidth, poolLength, poolHeight);
		double volume = PoolVolume.getVolume();
		
		System.out.printf("The volume of the swimming pool is : %.2f\n", volume);
		
		FillTime FillTimeOBJ = new FillTime (volume);
		double time = FillTimeOBJ.getTime();
		
		System.out.printf("The time in which the pool is filled is : %.2f\n", time, "hours");
		
	}
}