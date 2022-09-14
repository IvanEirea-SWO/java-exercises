package utils;

public class EjercicioCinco {
	
	public static boolean isEven(int numberInput) { 
		
		boolean isEven; 
		if (numberInput % 2 == 0) {
			System.out.println("It's even");
			isEven = true;
		} else {
			System.out.println("It's odd");
			isEven = false;
		}
		return isEven;
		
	}

}
