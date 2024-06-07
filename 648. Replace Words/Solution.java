class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
       String[]str=sentence.split(" ");
    Set<String>set=new HashSet<>(dictionary);
       for(int i=0;i<str.length;i++)
       {
          String  s=str[i];

          for(int j=0;j<s.length();j++)
          {
            

            if(set.contains(s.substring(0,j)))
            {
                str[i]=s.substring(0,j);
                break;
            }
          }
       }
       StringBuilder sst=new StringBuilder();
       for(int i=0;i<str.length;i++)
       {
          sst.append(str[i]);
          sst.append(" ");
       }
       return sst.toString().trim();
    }
}
