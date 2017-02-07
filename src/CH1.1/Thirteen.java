import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Thirteen {
	public static int[][] transpose(int[][] a) {
		int M = a.length;
		int N = a[0].length;

		int[][] b = new int[N][M];
		for (int j=0; j<N; j++) {
			for (int i=0; i<M; i++) {
				b[j][i] = a[i][j];
			}
		}
		return b;
	}

	public static void printIntMatrix(int[][] a) {
		int M = a.length;
		int N = a[0].length;
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				StdOut.printf("%3s", a[i][j]);
			}
			StdOut.println();
		}
	}

	public static void main(String[] args) {
		int M = Integer.parseInt(args[0]);
		int N = Integer.parseInt(args[1]);
		int[][] matrix = new int[M][N];

		//Initalize
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				matrix[i][j] = StdRandom.uniform(100);
			}
		}
		printIntMatrix(matrix);

		//Test
		int[][] tranMatrix = transpose(matrix);
		int[][] tranTranMatrix = transpose(transpose(matrix));
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				if (matrix[i][j] != tranMatrix[j][i]) {
					StdOut.print("Error");
					return;
				}
				if (matrix[i][j] != tranTranMatrix[i][j]) {
					StdOut.print("Error");
					return;
				}
			}
		}
		StdOut.print("Success!");
	}
}