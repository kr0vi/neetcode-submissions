class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force
        
        for(int i =0; i<nums.length; i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i]+nums[j]==target){
    
                    return new int[] {i,j};
                 
                }
            }
        }
        // will never hit as every array does contain 1 valid sequence
        return new int[]{};
    }
}
