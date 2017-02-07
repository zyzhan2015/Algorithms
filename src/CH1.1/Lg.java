public class Lg {
	public static int lg(int N) {
		if (N < 1) return -1;
		if (N == 1) return 0;
		int a = 1;
		while (a <= N) {
			a *= 2;
		}
		return a / 2;
	}

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int a = lg(N);
		if (a >= 0) {
			System.out.println(a);
		} else {
			System.out.println("Input Error");
		}
	}
}