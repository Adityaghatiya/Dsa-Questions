class Solution {
    public int numberOfBeams(String[] bank) {
        int sum = 0;
        int device = 0;

        for (int i = 0; i < bank.length; i++) {
            int sdevice = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                String s = bank[i];
                
                if (s.charAt(j) == '1') {
                    sdevice++;
                }
            }
            
            if(sdevice>0)
            {
                sum = sum + device * sdevice;
               device = sdevice;
            }
        }
        return sum;
    }
}
