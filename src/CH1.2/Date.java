import edu.princeton.cs.algs4.StdOut;

public class Date implements Datable {
	private final int value;

	public Date(int m, int d, int y) {
		value = y*512 + m*32 + d;
	}

	public int month() {
		return (value/32) % 16;
	}

	public int day() {
		return value % 32;
	}

	public int year() {
		return value / 512;
	}

	public String toString() {
		return month() + "/" + day() + "/" + year();
	}

	public boolean equals(Object x) {
		if (this == x) return true;
		if (x == null) return false;
		if (this.getClass() != x.getClass()) return false;
		Date that = (Date) x;
		if (this.day() != that.day()) 		return false;
		if (this.month() != that.month()) return false;
		if (this.year() != that.year()) 	return false;
		return true;
	}

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		int y = Integer.parseInt(args[2]);
		Date date = new Date(m, d, y);
		StdOut.println(date);
	}
}
