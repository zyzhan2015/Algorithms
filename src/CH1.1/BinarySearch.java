import java.util.Arrays;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;


public class BinarySearch {
    // public static int rank(int key, int[] a) {
    //     int lo = 0;
    //     int hi = a.length - 1;
    //     while (lo <= hi) {
    //         int mid = lo + (hi - lo) / 2;
    //         if      (key < a[mid]) hi = mid - 1;
    //         else if (key > a[mid]) lo = mid + 1;
    //         else                   return mid;
    //     }
    //     return -1;
    // }

    public static int rankRecursion(int key, int[] a) {
        return rankRecursion(key, a, 0, a.length-1);
    }
    public static int rankRecursion(int key, int[] a, int lo, int hi) {
        // StdOut.printf("%2d %2d\n", lo, hi);
        if (lo > hi) return -1;
        int mid = (lo + hi) / 2;
        if      (key < a[mid]) return rankRecursion(key, a, lo, mid-1);
        else if (key > a[mid]) return rankRecursion(key, a, mid+1, hi);
        else                   return mid;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        char option = args[1].charAt(0);

        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (option == '+') {
                if (rankRecursion(key, whitelist) == -1) {
                    StdOut.println(key);
                }
            } else if (option == '-') {
                if (rankRecursion(key, whitelist) != -1) {
                    StdOut.println(key);
                }
            } else {
                if (rankRecursion(key, whitelist) == -1) {
                    StdOut.println(key);
                }
            }
        }
    }
}