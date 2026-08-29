class Solution {
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        //dutch national flag
        int start=0,mid=0,end=nums.length-1;
        while(mid<=end){
            switch(nums[mid]){
                case 0:
                    swap(nums,start,mid);
                    mid++;
                    start++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums,end,mid);
                    end--;

                    break;
            }
        }
        
    }
}