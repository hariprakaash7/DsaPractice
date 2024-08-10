package dsa;

import dsa.node.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InorderPreOrderToBstTest {

    @Test
    void shouldCreateANewTreeFromInorderAndPreOrder() {
        Node node = new Node(3);
        node.left = new Node(1);
        node.right = new Node(5);

        int[] pre = {3,1,5};
        int[] in = {1,3,5};

        InorderPreOrderToBst inorderPreOrderToBst = new InorderPreOrderToBst(pre,in);
        Node data = inorderPreOrderToBst.calculateTree();
        Assertions.assertEquals(node,data);
    }

    @Test
    void shouldCreateANewTreeFromInorderAndPreOrderForMoreNodes() {
        Node node = new Node(3);
        node.left = new Node(1);
        node.right = new Node(5);
        node.left.left = new Node(0);
        node.right.right = new Node(6);

        int[] pre = {3,1,0,5,6};
        int[] in = {0,1,3,5,6};

        InorderPreOrderToBst inorderPreOrderToBst = new InorderPreOrderToBst(pre,in);
        Node actual = inorderPreOrderToBst.calculateTree();
        Assertions.assertEquals(actual,node);

    }
}
