

public class HcfAndLcm {
	private static int hcf(int p, int q) {
		if(q == 0) {
			return p;
		}
		int big = p < q? q: p;
		int small = p < q? p: q;
		int rem = big %small;
		return hcf(small, rem);
		
	}
	
	private static int lcm(int p, int q) {
		int hcf = hcf(p, q);
		return (p * q)/ hcf;
		
	}
	
	public static void main (String args[]) throws Exception {
		System.out.println(hcf(75, 50));
		System.out.println(lcm(75, 50));
	}
}
