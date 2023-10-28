import java.util.*;

class isomorphic_string {
    public static void main(String args[]) {
        String s = "abb" , t = "cdd";
        System.out.println(isIsomorphic(s , t) ? "true" : "false");
    }

    public static boolean isIsomorphic(String s , String t) {
        HashMap <Character , Character> replacement = new HashMap <>();
        HashMap <Character , Boolean> used = new HashMap <>();

        for(int i = 0 ; i < s.length() ; i++) {
            if(replacement.containsKey(s.charAt(i))) {
                if(replacement.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            else {
                if(used.containsKey(t.charAt(i)))
                    return false;
                replacement.put(s.charAt(i) , t.charAt(i));
                used.put(t.charAt(i) , true);
            }
        }

        return true;
    }
}
true
Complexity Analysis of Isomorphic Strings Leetcode Solution
Time Complexity
O(N), N = length of strings s and t.

Ezoic
Space Complexity 
O(1), as there will be a con
