class Solution {
    public void mergeSort(int[] nums){
        int len =nums.length;
        if(len<=1) return;
        int mid = nums.length/2;

        int[] left = new int[mid];
        int[] right = new int[len-mid];
        int i=0,j=0;
        for(;i<len;i++){
            if(i<mid){
                left[i] = nums[i];
            }
            else{
                right[j]=nums[i];
                j++;
            }
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,nums);
    }
    private void merge(int[] left,int[] right,int[] nums){
        int i=0,r=0,l=0;
        int leftSize = nums.length/2;
        int rightSize = nums.length-leftSize;
        while(l<leftSize&&r<rightSize){
            if(left[l]<right[r]){
                nums[i]=left[l];
                i++;
                l++;
            }
            else{
                nums[i]=right[r];
                i++;
                r++;
            }
        }
        while(l<leftSize){
            nums[i]=left[l];
                i++;
                l++;
        }
        while(r<rightSize){
             nums[i]=right[r];
                i++;
                r++;
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }
}