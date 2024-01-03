class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        String s1=event1[0].replace(":","");
          String s2=event1[1].replace(":","");
            String s3=event2[0].replace(":","");
             String s4=event2[1].replace(":","");

             int a=Integer.parseInt(s1);
             int b=Integer.parseInt(s2);
             int c=Integer.parseInt(s3);
             int d=Integer.parseInt(s4);

             if(a>=c && a<=d)
             {
                 return true;
             }
             if(b>=c && b<=d)
             {
                 return true;
             }
             if(c>=a && c<=b)
             {
                 return true;
             }
             if(d>=a && d<=b)
             {
                 return true;
             }
             
             return false;
    }
}
