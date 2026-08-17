class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num1 = new int[nums.length*2];
        int index=0;
        for(int i=0;i<2;i++){
            for(int num:nums){
                num1[index++]=num;
            }
        }
        return num1;
    }
}