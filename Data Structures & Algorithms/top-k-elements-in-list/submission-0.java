class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // use hashmap, then sort it to get top k frequent keys 

        HashMap<Integer,Integer> freq = new HashMap<>();

        //fill hash map
        for(int elem:nums){
            freq.put(elem, freq.getOrDefault(elem,0)+1);
        }

        //sort hashmap into a list
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());


        int[] ans = new int[k];
        // get k keys from the list
        for (int i =0; i<k; i ++) {
            int key = list.get(i).getKey();
            ans[i] = key;
        }
        return ans;
    }
}
