class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] result = new int[n];
        
        // 1. Fill the left products array
        leftProducts[0] = 1; // Nothing is to the left of the first element
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }
        
        // 2. Fill the right products array
        rightProducts[n - 1] = 1; // Nothing is to the right of the last element
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }
        
        // 3. Multiply left and right products together
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }
        
        return result;
    }
}