class Solution {
    public boolean isPalindrome(String s) {
        
        String t = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        char[] ct = t.toCharArray();
         int i= 0;
         int j = ct.length-1;
        while(i<j){
            if(ct[i]!=ct[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
