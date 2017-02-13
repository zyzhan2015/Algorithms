import edu.princeton.cs.algs4.Point2D;

public class Point2DTest {
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		Point2D[] pointArray = new Point2D[N];
		double dist = 1.414;
		for (int i=0; i<N; i++) {
			double x = Math.random();
			double y = Math.random();
			Point2D p = new Point2D(x, y);
			pointArray[i] = p;
			for (int j=0; j<i; j++) {
				double p2p = p.distanceTo(pointArray[j]);
				dist = Math.min(dist, p2p);
			}
		}
		System.out.println(dist);
	}
}
