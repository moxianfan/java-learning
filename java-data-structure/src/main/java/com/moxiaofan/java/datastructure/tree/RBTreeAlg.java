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
            //y设置为根节点
            this.mRoot = y;
        } else {
            if(x.parent.left == x) {
                x.parent.left = y;
            } else {
                x.parent.right = y;
            }
        }

        y.left = x;
        x.parent = y;
    }

    /**
     * 对红黑树的节点(y)进行右旋转
     *
     * 右旋示意图(对节点y进行左旋)：
     *            py                              py
     *           /                               /
     *          y                               x
     *         /  \      --(右旋)-.            /  \                     #
     *        x   ry                         lx   y
     *       / \                                 / \                   #
     *      lx  rx                             rx  ry
     *
     */
    private void rightRotate(RBTNode y) {
        RBTNode x = y.left;
        y.left = x.right;

        if(x.right != null) {
            x.right.parent = y;
        }

        x.parent = y.parent;

        if(y.parent != null) {
            this.mRoot = x;
        }
        else{
            if(y.parent.right == x) {
                y.parent.right = x;
            }
            else{
                y.parent.left = x;
            }
        }

        x.right = y;

        y.parent = x;
    }
}
