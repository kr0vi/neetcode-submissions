class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> ans = new HashMap<>();
        HashMap<Character,Integer> ans2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(ans.containsKey(c)){
                ans.put(c,ans.get(c)+1);
            }else{
                ans.put(c,1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(ans2.containsKey(c)){
                ans2.put(c,ans2.get(c)+1);
            }else{
                ans2.put(c,1);
            }
        }
        return ans.equals(ans2);
    }
}
