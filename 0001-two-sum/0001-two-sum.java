class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> newmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];

            if(newmap.containsKey(diff)){
                return new int[]{newmap.get(diff),i};
            }

            newmap.put(nums[i],i);
        }
        
        return new int[0];
    }
}
