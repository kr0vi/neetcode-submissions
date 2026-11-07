class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // fill a hashmap to count frequencies
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        // using bucket sort 
        // use a frequency array, where each frequence has a list 
        List<Integer>[] bucket = new List[nums.length + 1]; // max frequency can be nums.length for an elem
        // so think of it LinkedHashMap
        // [0,1,2,3,4,5] 
        // [[],[],[],[],[]]
        // this is a frequency array each index represents the frequency
        // so we fill this and at end take last k index which are filled

        // step 3 fill bucket
        for(int num: map.keySet()){
            int frequency = map.get(num);
            // if that freq index is empty create a new array
            if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<Integer>();
            }
            // fill the array with the current num which has same freq
            bucket[frequency].add(num);
        }
        int[] ans = new int[k];
        int index = 0;
        //step 4 take the last k elems;
        for(int i = bucket.length-1; i >=1; i--){
            if(bucket[i]==null){
                 // skip
            }
            else{
                //every num in bucket at that index
                for(int num:bucket[i]){
                    ans[index] = num;
                    index++;
                    if (index == k) {
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}
