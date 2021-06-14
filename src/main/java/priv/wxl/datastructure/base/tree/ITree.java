package priv.wxl.datastructure.base.tree;

import priv.wxl.datastructure.base.list.IList;

/**
 * @author xueli.wang
 * @since 2021/06/14 18:16
 */

public interface ITree<E> {
    void addChild(E e, E after);

    void remove(E e);

    void set(E old, E e);

    E getRoot();

    E leftChild();

    E rightSibling();

    IList<E> children();

    IList<E> breadthFirstTraversal();

    IList<E> deepFirstTraversal();
}
