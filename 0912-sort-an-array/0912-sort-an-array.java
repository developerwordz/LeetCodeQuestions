class Solution {
    private void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i]=array[j];
        array[j] = temp;
    }
    public void quickSort(int[] nums,int start,int end){
        if(end<=start) return;
        int pivot = partition(nums,start,end);
        quickSort(nums,start,pivot-1);
        quickSort(nums,pivot+1,end);

    }
    public int partition(int[] nums,int start,int end){
        int mid = start + (end-start)/2;
        swap(nums,mid,end);
        int pivot = nums[end];
        int i=start-1;
        int j = start;
        for(;j<end;j++){
            if(nums[j]<pivot){
                i++;
                swap(nums,i,j);
            }

        }
        i++;
        swap(nums,i,end);
        return i;
    }
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
}