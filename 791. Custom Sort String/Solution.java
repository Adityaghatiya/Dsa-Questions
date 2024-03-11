class Solution {
    public String customSortString(String order, String s) {
         HashMap<Character, Integer> frequencyMap = new HashMap<>();

      
        for (int i = 0; i < s.length(); i++) {
            frequencyMap.put(s.charAt(i), frequencyMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            if (frequencyMap.containsKey(ch) && frequencyMap.get(ch) > 0) {
                int freq = frequencyMap.get(ch);
                for (int j = 0; j < freq; j++) {
                    str.append(ch);
                }
                frequencyMap.remove(ch); 
            }
        }

        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            char ch = entry.getKey();
            int freq = entry.getValue();
            for (int i = 0; i < freq; i++) {
                str.append(ch);
            }
        }

        return str.toString();
    }
}
