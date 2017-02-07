 public class Fibonacci {
 	public static long F(int N, long[] fi) {
 		if (N == 0) return fi[0];
 		if (N == 1) return fi[1];
 		fi[N] = fi[N-1] + fi[N-2];
 		return fi[N];
 	}
 	public static void main(String[] args) {
 		long[] fi = new long[100];
 		fi[0] = 0;
 		fi[1] = 1;
 		for (int N = 0; N < 100; N++) {
 			System.out.println(N + " " + F(N, fi));
 		}
 	}
 }