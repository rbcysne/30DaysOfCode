/*
 * My copyright license
 */
package com.hackerrank.days;

import java.util.Scanner;

/**
 * Binary Search Tree - BST
 *
 * @author rommel
 */
public class HackerRank22 {

    static class Node {

        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int getHeight(Node root) {

        if (root.left == null && root.right == null) {
            return 0;
        }

        int heightLeft = 0;
        int heightRight = 0;

        if (root.left != null) {
            heightLeft = 1 + getHeight(root.left);
        }

        if (root.right != null) {
            heightRight = 1 + getHeight(root.right);
        }

        return (heightLeft > heightRight ? heightLeft : heightRight);

    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}
