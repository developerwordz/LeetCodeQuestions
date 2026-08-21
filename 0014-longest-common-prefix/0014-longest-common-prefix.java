class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int k=1;k<strs.length;k++){
            int index = 0;
            String s = strs[k];
           while(index<s.length()&&index<prefix.length()&&s.charAt(index)==prefix.charAt(index)){
            index++;
           }
            prefix = prefix.substring(0,index);
        }
        
        return prefix;
    }
}