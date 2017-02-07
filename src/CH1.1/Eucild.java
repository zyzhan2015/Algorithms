public class Eucild {
	public static int euclid (int p, int q) {
		if (p < q) {
			int temp = q;
			q = p;
			p = temp;
		}
		System.out.println(p + " " + q);
		if (p % q == 0) return q;
		return euclid(q, p % q);
	}
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(euclid(num1, num2));
	}
}