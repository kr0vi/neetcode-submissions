class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // we use a hashMap<HashMap,List>>
        // where inner hashMap will be the hash map for each individual String
        // so if any string has a similar hashMap we add it to the List
        // if not then super hashmap will add that string's hashmap 

        // main hash map
        HashMap<HashMap<Character,Integer>,List<String>> superHash = new HashMap<>();

        // loop through string
        for(String st:strs){
            // hash map for each string
            HashMap<Character,Integer> runningHash = new HashMap<>();

            // fill hash map
            for(int i=0; i<st.length();i++){
                char val = st.charAt(i);
                runningHash.put(val, runningHash.getOrDefault(val, 0) + 1);
            }
            // if super hash has this hashmap which means similar anagram, so we add to the list
            if(superHash.containsKey(runningHash)){

                superHash.get(runningHash).add(st);

            }else{
                // if not then a new anagram so we create a new list and add
                List<String> list = new ArrayList<>();
                list.add(st);
                superHash.put(runningHash, list);
            }
        }
        // return all the values into a list, each value will be a list of grouped anagrams
        return new ArrayList<>(superHash.values());
    }
}
