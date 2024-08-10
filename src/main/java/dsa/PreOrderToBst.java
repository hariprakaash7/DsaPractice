package dsa;

import dsa.node.Node;

public class PreOrderToBst {

    Node root = null;

    int[] a;

    public PreOrderToBst(int[] a) {
        this.a = a;
    }

    public void calculateTree() {
        for (int j : a) {
            root = create(j);
        }
    }


    private Node create(int data) {
         return createNode(root,data);
    }

    public void inorderRec()
    {
        inorderRec(root);
    }

    private void inorderRec(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        inorderRec(rootNode.left);
        System.out.println(rootNode.data);
        inorderRec(rootNode.right);
    }

    private Node createNode(Node rootData, int data) {
        if(rootData == null)
            return new Node(data);
        else {
            if(data < rootData.data)
            rootData.left = createNode(rootData.left,data);
            else
                rootData.right = createNode(rootData.right,data);

        }
        return rootData;
    }

}
