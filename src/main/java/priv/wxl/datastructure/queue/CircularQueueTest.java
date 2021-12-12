package priv.wxl.datastructure.queue;

/**
 * @author xueli.wang
 * @since 2021/12/12 17:09
 */

public class CircularQueueTest {
    public static void main(String[] args) {
        CircularQueue<String> queue = new CircularQueue<>(3);
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        System.out.println(queue.enqueue("4"));
        System.out.println(queue.dequeue());
        System.out.println(queue.enqueue("4"));
    }
}
