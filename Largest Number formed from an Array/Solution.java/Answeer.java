
class Solution {
    String printLargest(int n, String[] arr) {
        // code here
          Arrays.sort(arr, (a, b) -> {
            String s1 = a+b;
            String s2 = b+a;
            return s2.compareTo(s1);
        });
        StringBuilder sb=new StringBuilder();
        for(String ele: arr)sb.append(ele);
        return sb.toString();
    }
}
