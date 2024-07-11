class Solution {
    public String reverseParentheses(String s) {
        char str[]=s.toCharArray();
        Stack<Pair>stk=new Stack();

        for(int i=0;i<str.length;i++)
        {
           if(str[i]=='(')
           {
            stk.push(new Pair('(',i));
           }
           else if(!stk.isEmpty() && stk.peek().brk=='(' && str[i]==')')
           {
               Pair p=stk.pop();
               reverse(str,p.j+1,i-1);
           }
        }
       StringBuilder result = new StringBuilder();
        for (char c : str) {
            if (c != '(' && c != ')') {
                result.append(c);
            }
        }

        return result.toString();
    }
    public void reverse(char str[],int i,int j)
    {
        while(i<j)
        {
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
    }
    public class Pair{
        char brk;
        int j;

        public Pair(char brk,int j)
        {
            this.brk=brk;
            this.j=j;
        }
    }
}
