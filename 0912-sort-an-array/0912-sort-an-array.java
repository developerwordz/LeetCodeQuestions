class Solution {
    public void mergeSort(int[] array){
        int len = array.length;
        if(len<=1) return;
        int middle = len/2;
        int left[] = new int[middle];
        int right[] = new int[len-middle];
        int i=0,j=0;
        for(;i<len;i++){
            if(i<middle){
                left[i]=array[i];
            }
            else{
                right[j]=array[i];
                j++;
            }
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);
    }
    private void merge(int[] leftArray,int[] rightArray,int[] array){
        int i=0,l=0,r=0;
        int leftSize=array.length/2,rightSize=array.length-leftSize;
        while(l<leftSize&&r<rightSize){
            if(leftArray[l]<rightArray[r]){
                array[i]=leftArray[l];
                i++;
                l++;
            }
            else{
                array[i]=rightArray[r];
                i++;
                r++;
            }
        }
        while(l<leftSize){
             array[i]=leftArray[l];
                i++;
                l++;
        }
        while(r<rightSize){
            array[i]=rightArray[r];
            i++;
            r++;
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }
}