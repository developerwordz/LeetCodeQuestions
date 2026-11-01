class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1,num2=-1,cnt1=0,cnt2=0;
        for(int num:nums){
            if(num==num1) cnt1++;
            else if(num==num2) cnt2++;
            else if(cnt1==0) {
                num1=num;
                cnt1=1;
            }
            else if(cnt2==0){
                 num2=num;
                 cnt2=1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        //found 2 major elements but need n>3
        cnt1=cnt2=0;
        for(int num:nums){
            if(num==num1){
                cnt1++;
            }
            else if(num==num2){
                cnt2++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(cnt1>nums.length/3) list.add(num1);
        if(cnt2>nums.length/3) list.add(num2);
        return list;
    }
}