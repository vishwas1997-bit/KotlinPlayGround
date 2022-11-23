package program_practice;

import java.util.*;

// find the largest element in array
public class ArrayQuestion {

    public static void main(String[] args) {

//        int[] arr = {73, 74, 75, 71,
//                69, 72, 76, 73};
//
//        // Function call
//        dailyTemperatures(arr);
//
//        int[] input = {7,1,5,3,6,4};
//        System.out.println("MAxProfit : "+maxProfit(input));
//
//        int[] input1 = {1,0,1,1};
//        System.out.println(containsNearbyDuplicate(input1,1));

        int[] arr2 = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int n = arr2.length;
        System.out.println(maxSum(arr2, n, k));
    }

    static void dailyTemperatures(int[] T) {
        int n = T.length;

        // To store the answer
        int[] daysOfWait = new int[n];
        Arrays.fill(daysOfWait, -1);

        Stack<Integer> s = new Stack<>();

        // Traverse all the temperatures
        for (int i = 0; i < n; i++) {

            // Check if current index is the
            // next warmer temperature of
            // any previous indexes
            while (!s.isEmpty() && T[s.peek()] < T[i]) {
                daysOfWait[s.peek()] = i - s.peek();

                // Pop the element
                s.pop();
            }

            // Push the current index
            s.push(i);
        }

        // Print waiting days
        for (int i = 0; i < n; i++) {
            System.out.print(daysOfWait[i] + " ");
        }
    }

    public static int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for (int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur + (prices[i] - prices[i - 1]));
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    // Returns maximum sum in
    // a subarray of size k.
    private static int maxSum(int arr[], int n, int k) {
        // n must be greater
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        // Compute sum of first window of size k
        int max_sum = 0;
        for (int i = 0; i < k; i++)
            max_sum += arr[i];

        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int window_sum = max_sum;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }
}