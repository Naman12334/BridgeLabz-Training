import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        Set<Character> se = new HashSet<>();;
        int l =0;
        for(int r =0;r<s.length(); r++){
            if(se.contains(s.charAt(r))){
                while(l<r && se.contains(s.charAt(r))){
                    se.remove(s.charAt(l));
                    l++;
                }
            }
            se.add(s.charAt(r));
            max = Math.max(max , r-l+1);
        }
        return max;
        
    }
}