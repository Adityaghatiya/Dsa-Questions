class Solution {
    public String freqAlphabets(String s) {
        int i = 0;
        StringBuilder str = new StringBuilder();

        while (i < s.length()) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                String st = s.substring(i, i + 2);
                int temp = Integer.parseInt(st);
                char cc = (char) (temp + 96);
                str.append(cc);
                i += 3;
            } else {
                char cc = (char) (s.charAt(i) - '0' + 96);
                str.append(cc);
                i++;
            }
        }

        return str.toString();
    }
}
