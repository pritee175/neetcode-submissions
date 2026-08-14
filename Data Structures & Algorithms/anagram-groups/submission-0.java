class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char [] chara = s.toCharArray();
            Arrays.sort(chara);

            String ne = new String (chara);
            res.putIfAbsent(ne, new ArrayList<>());
            res.get(ne).add(s);
        }
        return new ArrayList<>(res.values());
        
    }
}
