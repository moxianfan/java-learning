package com.moxiaofan.java.datastructure.tree;

/**
 * @author wangxy
 * @date 2018/9/6
 */

public class RedBlackTree<T extends Comparable<T>> {
    // 根结点
    private RBTNode<T> mRoot;

    private static final boolean RED = false;
    private static final boolean BLACK = true;

    /**
     * color  颜色
     * key    关键字
     * left   左孩子
     * right  右孩子
     * parent 父结点
     *
     * @param <T>
     */
    public class RBTNode<T extends Comparable<T>> {
        boolean color;
        T key;
        RBTNode<T> left;
        RBTNode<T> right;
        RBTNode<T> parent;

        public RBTNode(T key, boolean color, RBTNode<T> parent, RBTNode<T> left, RBTNode<T> right) {
            this.key = key;
            this.color = color;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }

    }
}
