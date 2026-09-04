class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)>nums.length/3){
                res.add(i);
            }
        }
        return res;
    }
}