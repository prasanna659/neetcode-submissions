class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> count=new HashMap<>();
        int n=nums.length;
       // int j=n-1;
        for(int i=0;i<n;i++){
           int complement=target-nums[i];
            if(count.containsKey(complement)){
                return new int[] {count.get(complement),i};
            }
            count.put(nums[i],i);
        
        }
        return new int[] {};
    }
}
