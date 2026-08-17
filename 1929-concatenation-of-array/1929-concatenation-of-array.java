class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length*2;
        int[] num1 = new int[size];
        for(int i=0;i<size/2;i++){
            num1[i]=nums[i];
            num1[size/2+i] = nums[i];
        }
        return num1;
    }
}