class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> res= new HashMap<>();
        for(String s:strs){
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String sortedString = new String(sArray);
            res.putIfAbsent(sortedString,new ArrayList<>());
            res.get(sortedString).add(s);
        }
        return new ArrayList(res.values());
    }
}