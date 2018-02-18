
public class Power {
	static double power(int x, int y) {
		if(y == 0) {
			return 1;
		}
		int half = y/2;
		double value = power(x, half);
		if(y%2 == 0) {
			 return value * value;
		} else {
			if(y > 0) {
				return value * value * x;
			} else {
				return (value * value) / x;
			}
			
		}
	}
	
	public static void main(String args[]) 
			throws Exception {
		//System.out.println(power(2, -1));
		String x ="1"+"L"; 
		System.out.println(x.equals("1L"));
	}
}
