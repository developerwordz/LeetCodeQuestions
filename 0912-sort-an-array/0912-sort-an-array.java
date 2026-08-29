class Solution {
    private void swap(int[] array,int i,int j){
        int temp = array[i];
        array[i]=array[j];
        array[j] = temp;
    }
    public void quickSort(int[] nums,int start,int end){
        if(end<=start) return;
        int pivot = partition(nums,start,end);
        quickSort(nums,start,pivot);
        quickSort(nums,pivot+1,end);

    }
    public int partition(int[] nums,int start,int end){
        int mid = start + (end-start)/2;
        int pivot = nums[mid];
        int i = start-1;
        int j = end+1;
        while(true){
            do{
                i++;
             } while(nums[i]<pivot);
            do{
                j--;
             } while(nums[j]>pivot);
            if(i>=j){
                return j;
            }
            swap(nums,i,j);
        }
    }
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }
}