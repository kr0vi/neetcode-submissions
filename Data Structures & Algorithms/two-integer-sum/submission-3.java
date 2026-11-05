class Solution {
    public int[] twoSum(int[] nums, int target) {
        //optimal - use hash map and one pass technique
        // init a hashmap to track each elem in nums
        HashMap<Integer,Integer> arrayHash = new HashMap<>();

        //iterate over array and fill hash map together
        for(int i =0 ; i<nums.length;i++){
            int toFind = target-nums[i]; // if this elem exists in array combination is found
            if(arrayHash.containsKey(toFind)){
                // return that elem index + current index
                return new int[]{arrayHash.get(toFind),i};
            }
            else{
                // element, its index
                arrayHash.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
