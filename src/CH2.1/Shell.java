import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Shell {
    public static void sort(Comparable[] a) {
        int N = a.length;
        int count = 0;
        Stack<Integer> dist = new Stack<Integer>();
        int k = 1;
        dist.push(k);
        while(k < N / 3) {
            k = 3 * k + 1;
            dist.push(k);
        }
        while (!dist.isEmpty()) {
            //在母数组中遍历
            int h = dist.pop();
            for (int i = h; i < N; i++) {
                //在i对应的不同子数组中遍历比较
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h) {
                    exch(a, j, j-h);
                }
            }
            StdOut.printf("%6d-sort %6.3f\n", h, ((double)count)/N);
        }
    }
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //String[] a = StdIn.readAllStrings();
        for (int i=100; i<=1000000; i*=10) {
            Double[] rd = new Double[i];
            for (int j=0; j<i; j++) {
                rd[j] = StdRandom.uniform();
            }
            sort(rd);
        }
    }
}
