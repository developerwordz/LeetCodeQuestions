class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int num:nums){
            int freq = res.getOrDefault(num,0);
            res.put(num,freq+1);

            if(res.get(num)>nums.length/2){
                return num;
            }
        }
        return -1;
    }
}