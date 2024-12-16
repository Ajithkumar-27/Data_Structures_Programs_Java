

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }
    public static int maxSubArray(int arr[]){
        int maxSum=arr[0],minSum=arr[0];
        for(int i=1;i<arr.length;i++){
            minSum=Math.max(arr[i],minSum+arr[i]);
            maxSum=Math.max(maxSum,minSum);
        }
        return maxSum;
    }
}
