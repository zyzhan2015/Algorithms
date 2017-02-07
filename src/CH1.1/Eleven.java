import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Eleven {
	public static void main(String[] args) {
		int M = 10;
		int N = 10;
		boolean[][] a = new boolean[M][N];

		StdOut.print("  ");
		for (int k=0; k<N; k++) {
			StdOut.printf("%2s", k+1);
		}
		StdOut.println();

		for (int i=0; i<M; i++) {
			StdOut.printf("%2s", i+1);
			for (int j=0; j<N; j++) {
				if (StdRandom.uniform(2) == 1) {
					a[i][j] = true;
				} else {
					a[i][j] = false;
				}
				StdOut.printf("%2s", a[i][j] ? "*" : " ");
			}
			StdOut.println();
		}
	}
}