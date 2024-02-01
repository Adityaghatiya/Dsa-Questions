
class Solution {
    int lps(String s) {
        // code here
        
        int lps[]=new int[s.length()];
        
        int pref=0;
        int suff=1;
        
        Arrays.fill(lps,0);
        
        while(suff<s.length())
        {
            if(s.charAt(pref)==s.charAt(suff))
            {
                lps[suff]=pref+1;
                suff++;
                pref++;
                
            }
            else
            {
                if(pref==0)
                {
                    lps[suff]=0;
                    suff++;
                }
                else
                {
                    pref=lps[pref-1];
                }
            }
        }
        return lps[s.length()-1];
    }
}
