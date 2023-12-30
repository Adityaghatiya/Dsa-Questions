class Solution {
    public int minimizedStringLength(String s) {
        Set<Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            set.add(ch);

        }
        return set.size();
    }
}
