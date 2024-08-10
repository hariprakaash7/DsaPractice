package algorithms;

import java.util.PriorityQueue;

public class KthLargestSubarray {
    int[] a;
    int k;
    KthLargestSubarray(int[] a,int k) {
        this.a=a;
        this.k=k;
    }

    public int kthLargest() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0;i<a.length;i++) {
            priorityQueue.add(a[i]);
            for(int j=i+1;j<a.length;j++) {
                priorityQueue.add(a[j]);
            }
        }
        return 2;
    }
}
