// c. Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
// Examples: 
// Input: arr[]   = {3, 0, 0, 2, 0, 4}
// Output: 10

public class exp_3_c {
    public static void main(String[] args) {
        int[] arr = {3,0,0,2,0,4};
        int res = 0;
        int n = arr.length;
        for(int i = 1;i<n-1;i++){
            int left = arr[i];
            for(int j = 0;j<i;j++){
                left = Math.max(left,arr[j]);
            }
            int right = arr[i];
            for(int j = i+1;j<n;j++){
                right = Math.max(right,arr[j]);
            }
            res += Math.min(left,right)-arr[i];
        }
        System.out.println(res);
    }
}
