package priv.wxl.algorithm.sort;

/**
 * @author xueli.wang
 * @since 2021/12/12 18:45
 */

public class InsertionSort {
    public void sort(int[] list) {
        if (list == null || list.length <= 1) {
            return;
        }

        int n = list.length;
        for (int i = 1; i < n; i++) {
            int value = list[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (list[j] > value) {
                    list[j + 1] = list[j];
                } else {
                    break;
                }
            }
            list[j + 1] = value;
        }
    }
}
