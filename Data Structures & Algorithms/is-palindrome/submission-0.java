class Solution {
    public boolean isPalindrome(String s) {
        
        String t = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        char[] ct = t.toCharArray();

        for(int i=0;i<ct.length/2;i++){
            if(ct[i]!=ct[ct.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
