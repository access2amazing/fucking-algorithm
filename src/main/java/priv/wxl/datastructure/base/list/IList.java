package priv.wxl.datastructure.base.list;

/**
 * @author xueli.wang
 * @since 2021/06/14 17:27
 */

public interface IList<E> {
    void add(E e);

    void remove(E e);

    void remove(int index);

    E set(int index, E e);

    int indexOf(E e);

    int lastIndexOf(E e);
}
