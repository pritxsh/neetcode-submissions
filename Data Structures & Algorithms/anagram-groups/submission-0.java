class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
    Map<String,List<String>> map = new HashMap<>();

      for(String elem: strs){
        char[] ch = elem.toCharArray();
         Arrays.sort(ch);
         String newstr = new String(ch);
    map.computeIfAbsent(newstr,k->new ArrayList<>()).add(elem);
      }
      return new ArrayList<>(map.values());
    }
}
