package com.moxiaofan.java.datastructure.tree;

import com.moxiaofan.java.datastructure.tree.RedBlackTree.RBTNode;

/**
 * @author wangxy
 * @date 2018/9/6
 */

public class RBTreeAlg {

    /**
     * 对红黑树的节点(x)进行左旋转
     * <p>
     * 左旋示意图(对节点x进行左旋)：
     *    px                              px
     *    /                               /
     *    x                               y
     *   /  \      --(左旋)-.            / \                #
     *  lx   y                         x   ry
     *      / \                       / \
     *     ly ry                     lx ly
     */
    private void leftRotate(RBTNode x) {
        RBTNode y = x.right;
        x.right = y.left;
        if (y.left != null) {
            y.left.parent = x;
        }

        y.parent = x.parent;

        if(x.parent == null) {

        } else {
            if(x.parent.left == x) {
                x.parent.left == y;
            } else {
                x.parent.right == y;
            }
        }

    }
}
