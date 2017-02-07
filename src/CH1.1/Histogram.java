public class Histogram {
	public static int[] histogram(int[] a, int M) {
		int[] b = new int[M];
		for (int i=0; i<a.length; i++) {
			if (a[i] < M) {
				b[a[i]] += 1;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		int[] a = {0, 1, 2, 2, 3, 3, 3};
		int[] b = histogram(a, 3);
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}
}