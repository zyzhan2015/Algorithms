public class Ln {
	public static double lnf(int N) {
		if (N == 0) return 0;
		return lnf(N-1) + Math.log(N);
	}

	public static void main(String[] args) {
		System.out.println(lnf(1));	
		System.out.println(lnf(5));	
		System.out.println(lnf(10));	
	}
}