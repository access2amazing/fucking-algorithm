package priv.wxl.algorithm.sort;

/**
 * @author xueli.wang
 * @since 2021/12/12 20:54
 */

public class SelectionSort {
    public void sort(int[] a) {
        if (a == null || a.length <= 1) {
            return;
        }

        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minPos = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minPos]) {
                    minPos = j;
                }
            }
            if (minPos != i) {
                int temp = a[i];
                a[i] = a[minPos];
                a[minPos] = temp;
            }
        }
    }
}
