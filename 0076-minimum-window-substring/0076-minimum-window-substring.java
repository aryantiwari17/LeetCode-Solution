class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        
        int[] need = new int[128];
        
        // Step 1: count characters of t
        for (char c : t.toCharArray()) {
            need[c]++;
        }
        
        int left = 0, right = 0;
        int required = t.length();
        
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        
        while (right < s.length()) {
            char c = s.charAt(right);
            
            // If this char is needed
            if (need[c] > 0) {
                required--;
            }
            need[c]--;
            right++;
            
            // When all characters matched
            while (required == 0) {
                // Update minimum window
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
                
                char leftChar = s.charAt(left);
                need[leftChar]++;
                
                // If a required char is removed
                if (need[leftChar] > 0) {
                    required++;
                }
                
                left++;
            }
        }
        
        return minLen == Integer.MAX_VALUE ? "" 
                                           : s.substring(start, start + minLen);
    }
}