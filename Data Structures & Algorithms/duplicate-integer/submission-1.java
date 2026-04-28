class Solution {
    public boolean hasDuplicate(int[] nums) {
        
    Map<Integer,Integer> map = new HashMap<>();

   for(int num : nums){

     int freq = map.getOrDefault(num,0);

     map.put(num,freq+1);
     if(freq>0){
        return true;
     }
   }
     return false;
    }
}