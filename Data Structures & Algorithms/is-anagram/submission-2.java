class Solution {
    public boolean isAnagram(String s, String t) {
     
     Map<Character,Integer> map = new HashMap<>();
    if(s.length() != t.length()){
        return false;
    }
     for(char ch: s.toCharArray()){
        int count = map.getOrDefault(ch,0);
        map.put(ch,count+1);
     }

     for(char ch: t.toCharArray()){
        int count = map.getOrDefault(ch,0);
        if(!map.containsKey(ch)){
             return false;
        }
         map.put(ch,count-1);
         if(map.get(ch)==0){
            map.remove(ch);
         }
     }

     return map.isEmpty();
    }
}
