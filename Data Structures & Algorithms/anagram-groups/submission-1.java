class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
        //     char [] chara = s.toCharArray();
        //     Arrays.sort(chara);

        //     String ne = new String (chara);
        //     res.putIfAbsent(ne, new ArrayList<>());
        //     res.get(ne).add(s);
        // }
        // return new ArrayList<>(res.values());
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c-'a']++;
        }
        String key = Arrays.toString(count);
        res.putIfAbsent(key, new ArrayList<>());
        res.get(key).add(s);
        }
        return new ArrayList<>(res.values());

        
    }
}
