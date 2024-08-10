package dsa;

import dsa.node.Node;

import java.util.HashMap;

public class InorderPreOrderToBst {

    int[] pre;

    int[] in;

    static HashMap<Integer,Integer> integerIntegerHashMap = new HashMap<>();

    static int preIndex = 0;

    static Node root;

    public InorderPreOrderToBst(int[] pre, int[] in) {
        this.pre = pre;
        this.in = in;
    }

    public Node calculateTree() {
        for(int i=0;i<in.length;i++) {
            integerIntegerHashMap.put(in[i],i);
        }
        root = calculateTreeUtil(0,in.length-1);
        return root;
    }

    private Node calculateTreeUtil(int start, int end) {
        if(start > end) {
            return null;
        }
        System.out.println("Start "+ start+ "end "+end);
        int a = pre[preIndex++];
        System.out.println(a);
        Node node = new Node(a);

        if (start == end)
            return node;

        int index = integerIntegerHashMap.get(a);

        node.left = calculateTreeUtil(0,index-1);
        node.right = calculateTreeUtil(index+1, in.length-1);
        return node;
    }
}
