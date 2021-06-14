package priv.wxl.algorithm.sort;

import java.util.Arrays;

/**
 * @author xueli.wang
 * @since 2021/05/23 23:33
 */

public class QuickSort {
    public static void main(String[] args) {
        String[] a = new String[]{"K", "R", "A", "T", "E", "L",
                "E", "P", "U", "I", "M", "Q", "C", "X", "O", "S"};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    private static void sort(Comparable[] a, int lo, int high) {
        if (high <= lo) {
            return;
        }

        int j = partition(a, lo, high);
        sort(a, lo, j - 1);
        sort(a, j + 1, high);
    }

    private static int partition(Comparable[] a, int lo, int high) {
        int i = lo;
        int j = high + 1;
        Comparable v = a[lo];
        while (true) {
            while (a[++i].compareTo(v) < 0) {
                if (i == high) {
                    break;
                }
            }

            while (v.compareTo(a[--j]) < 0) {
                if (j == lo) {
                    break;
                }
            }

            if (i >= j) {
                break;
            }

            exch(a, i, j);
        }

        exch(a, lo, j);
        return j;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
