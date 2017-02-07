public class Binomial {
	public static double binomial(int N, int k, double p, double[][] nkArray) {
		if (N <= 0 || k <= 0) {
			if (N == 0 && k == 0) return 1.0;
			else 									return 0.0;
		}
		nkArray[N][k] = (1.0 - p) * nkArray[N-1][k] + p * nkArray[N-1][k-1];
		return nkArray[N][k];
	}

	public static void main(String[] args) {
		double[][] nkArray = new double[101][51];
		for (int N=0; N<=100; N++) {
			for (int k=0; k<=50; k++) {
				nkArray[N][k] = binomial(N, k, 0.25, nkArray);
				System.out.println(nkArray[N][k]);
			}
		}
		System.out.println(binomial(100, 50, 0.25, nkArray));
	}
}