package test;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
    	if (s == null)  return 0; 
    	
    	HashSet<Character> m = new HashSet<Character>();
    	int maxLength = 0;
    	int i = 0;
    	int j = 0;
    	while (j < s.length()) {
    		if (m.contains(s.charAt(j))) {
    			if (j - i > maxLength) {
    				maxLength = j - i;
    			}
    			m.remove(s.charAt(i));
    			i += 1;
    		} else {
    			m.add(s.charAt(j));
    			++ j;
    		}
    	}
    	
    	if (j - i > maxLength) {
    		maxLength = j - i;
    	}
    	
        return maxLength;
    }
    
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}

}
