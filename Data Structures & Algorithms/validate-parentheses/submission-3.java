class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        char cts[] = s.toCharArray();

        for(char ch : cts){
            if(ch=='('){
                stack.push(')');
            }
            else if(ch=='['){
                stack.push(']');
            }
            else if(ch=='{'){
                stack.push('}');
            }
            else if(stack.isEmpty()|| stack.pop()!=ch){
                return false;
            }
        } 
        return stack.isEmpty();
    }
}
