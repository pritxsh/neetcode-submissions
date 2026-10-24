class Solution {
    public boolean isAnagram(String s, String t) {

   Map<Character,Integer> map = new HashMap<>();

    if(s.length()!=t.length()){
        return false;
    }
   for(char ch : s.toCharArray()){
    int freq = map.getOrDefault(ch,0);
    map.put(ch, freq+1);
   }

   for(char ch: t.toCharArray()){
    if(!map.containsKey(ch)){
        return false;
    }
     int freq = map.get(ch);
        map.put(ch,freq-1);
     if(map.get(ch)==0){
        map.remove(ch);
     }
   }
   return map.isEmpty();
    }
}
