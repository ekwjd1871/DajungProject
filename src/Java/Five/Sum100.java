package Java.Five;

public class Sum100 {

	public static void main(String[] args) {
		
		System.out.println(sum100());
	}
	
	static double sum100(){
		double sum = 0.0;
		double i = 1.0;
		for(int k = 0; k < 100; k++){
			sum += i;
			i += 1.0;
		}
		return sum;
	}
}
