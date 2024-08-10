package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {

    List<List<Integer>> list = new ArrayList<>();

    private static final Stack<Integer> stack = new Stack<>();

    public TopologicalSort() {
        List<List<Integer> > edges = new ArrayList<>();
        edges.add(Arrays.asList(0, 1));
        edges.add(Arrays.asList(1, 2));
        edges.add(Arrays.asList(3, 1));
        edges.add(Arrays.asList(3, 2));
        for (int i=0;i<4;i++) {
            list.add(new ArrayList<>());
        }
        for (List<Integer> i : edges) {
            list.get(i.get(0)).add(i.get(1));
        }
    }

    public void toposort() {
        boolean[] visited = new boolean[4];
        for (int i=0;i<4;i++) {
            if(!visited[i])
                toposortUtil(visited, i);
        }
    }
    private void toposortUtil(boolean[] visited, int data) {
        visited[data] = true;

        List <Integer> a= list.get(data);

        for (Integer i: a) {
            System.out.println("Data "+i+ "Vertex "+data);
            if (!visited[i]) {
                toposortUtil(visited,i);
            }
        }
        stack.push(data);
    }
    public void getOutput() {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ");
        }
    }
}
