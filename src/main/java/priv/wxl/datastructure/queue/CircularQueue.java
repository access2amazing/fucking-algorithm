package priv.wxl.datastructure.queue;

/**
 * @author xueli.wang
 * @since 2021/12/12 15:20
 */

public class CircularQueue<E> {

    private Object[] elements;
    private int head;
    private int tail;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
    }

    public boolean enqueue(E e) {
        if ((tail + 1) % capacity == head) {
            return false;
        }

        elements[tail] = e;
        tail = (tail + 1) % capacity;
        return true;
    }

    public E dequeue() {
        if (head == tail) {
            return null;
        }

        @SuppressWarnings("unchecked")
        E e = (E) elements[head];
        head = (head + 1) % capacity;

        return e;
    }
}
