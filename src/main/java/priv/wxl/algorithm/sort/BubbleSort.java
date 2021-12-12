package priv.wxl.algorithm.sort;

/**
 * @author xueli.wang
 * @since 2021/12/12 20:17
 */

public class BubbleSort {
    public void sort(int[] a) {
        if (a == null || a.length <= 1) {
            return;
        }

        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
