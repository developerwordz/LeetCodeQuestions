class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; 
        for(int i=1;i<strs.length;i++){
            String s = strs[i];
            int j = 0;
            while(j<s.length()&&j<prefix.length()&&s.charAt(j)==prefix.charAt(j)){
                j++;
            }
            prefix = prefix.substring(0,j);
        }
        return prefix;
    }
}