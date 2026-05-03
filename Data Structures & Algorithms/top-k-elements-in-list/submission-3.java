class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map  = new HashMap<>();
        
        for(int elem: nums){

        int freq = map.getOrDefault(elem,0);
           map.put(elem,freq+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->map.get(b)-map.get(a));
       int[] result = new int[k];
        for(int i=0;i<k;i++){
          result[i] = list.get(i);
        }
        return result;
    }
}
