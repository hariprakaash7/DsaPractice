package dsa;

import java.util.LinkedList;
import java.util.Queue;

public class TreeHeight {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    Node root = null;

    public TreeHeight() {
    }

    public void addNode(int data) {
        if(root == null) {
            root = new Node(data);
        } else {
            if(data < root.data) {
                if (root.left == null) {
                    root.left = new Node(data);
                }
                else addNode(root.left,data);
            }
            else {
                if (root.right == null)
                    root.right = new Node(data);
                else addNode(root.right,data);
            }
        }
    }

    public void addNode(Node rootData, int data) {
            if(data < rootData.data) {
                if (rootData.left == null) {
                    rootData.left = new Node(data);
                }
               else addNode(rootData.left,data);
            }
            else {
                if (rootData.right == null)
                    rootData.right = new Node(data);
                else addNode(rootData.right,data);
            }
    }
    public int heightOfTree() {
        if(root == null) {
            return 0;
        }
        int leftHeight = 1+heightOfTree(root.left);
        int right = 1+heightOfTree(root.right);
        return Math.max(leftHeight,right);
    }

    public int heightOfTree(Node rootData) {
        if(rootData == null) {
            return 0;
        }
        int leftHeight = 1+heightOfTree(rootData.left);
        int right = 1+heightOfTree(rootData.right);
        return Math.max(leftHeight,right);
    }

}
