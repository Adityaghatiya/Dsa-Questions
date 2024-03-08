class Solution {
        boolean sameFreq(String s) {
        // code here
        int arr[] = new int[26];

        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }

        if (check(arr, 26)) {
            return true;
        }

        for (int i = 0; i < 26; i++) {

            if (arr[i] > 0) {
                arr[i]--;
                if (check(arr, 26)) {
                    return true;
                }

                arr[i]++;
            }

        }
        return false;

    }

    boolean check(int arr[], int sz) {
        int cnt = 0;
        int i = 0;
        for (; i < sz; i++) {
            if (arr[i] > 0) {
                cnt = arr[i];
                break;
            }
        }
        for (int j = i; j < sz; j++) {
            if (arr[j] > 0 && arr[j] != cnt) {
                return false;
            }
        }
        return true;
    }
}
