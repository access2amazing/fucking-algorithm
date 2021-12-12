package priv.wxl.algorithm.sort;

import java.util.Arrays;

/**
 * @author xueli.wang
 * @since 2021/12/12 20:06
 */

public class SortTest {
    public static void main(String[] args) {
        int[] list = new int[]{4,5,6,1,3,2};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(list);
        System.out.println(Arrays.toString(list));

        list = new int[]{4,5,6,1,3,2};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(list);
        System.out.println(Arrays.toString(list));

        list = new int[]{4,5,6,1,3,2};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
