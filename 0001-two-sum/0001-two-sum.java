import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int A[][] = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            A[i][0] = nums[i];
            A[i][1] = i;
        }
        Arrays.sort(A,Comparator.comparingInt(a->a[0]));
        int i=0,j=nums.length-1;
        while(i<j){
            int current = A[i][0] + A[j][0];
            if(current>target){
                j--;
            }
            else if(current<target){
                i++;
            }
            else{
                return new int[]{A[i][1],A[j][1]};

            }
        }
        return new int[0];
    }
}