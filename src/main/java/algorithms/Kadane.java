package algorithms;

public class Kadane {
    private final int[] a;

    int max_sum = Integer.MIN_VALUE;
    int max_sum_till_now = 0;
    public Kadane(int[] a) {
        this.a =a;
    }

    public int calculateMaxSubArray() {
        for(int i=0;i<a.length;i++) {
                max_sum_till_now+=a[i];
                if(max_sum < max_sum_till_now) {
                    max_sum = max_sum_till_now;
                }
                if(max_sum_till_now < 0) {
                    max_sum_till_now = 0;
                }
        }
        return max_sum;
    }
}
