class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] res = new int[2]; 
        
        Map<Integer,Integer> map = new HashMap<>();
       
       for(int i=0;i<nums.length;i++){

         int friend = target -nums[i];

         if(map.containsKey(friend)){
            res[0] = map.get(friend);
            res[1] = i;
            return res;
         }
         map.put(nums[i],i);
       }
       return new int[]{-1, -1};
    }
}
