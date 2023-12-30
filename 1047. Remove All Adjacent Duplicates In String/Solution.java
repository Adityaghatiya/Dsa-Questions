class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>stack=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(!stack.isEmpty() && stack.peek()==s.charAt(i))
            {
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        
        return result.reverse().toString();
    }
}
