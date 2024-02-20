
class Solution{
    static int minValue(String s, int k){
        // code here
          HashMap<Character,Integer> map = new HashMap<>();
        
        // Count the occurrences of each character in the string
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        // Create a priority queue to store the frequencies of characters in descending order
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        que.addAll(map.values());
        
        // Decrement the top k elements from the queue
        while (k > 0) {
            int temp = que.poll();
            que.offer(temp - 1);
            k--;
        }
        
        // Calculate the sum of squares of the remaining frequencies in the queue
        int ans = 0;
        while (!que.isEmpty()) {
            int frequency = que.poll();
            ans += frequency * frequency;
        }
        
        return ans;
    }
}
