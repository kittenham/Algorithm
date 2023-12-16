import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        Set<Character> mySet = new HashSet<>();
        StringBuilder myStr = new StringBuilder();
        for(char i : my_string.toCharArray()){
            if(!mySet.contains(i)){
                mySet.add(i);
                myStr.append(i);
            }
        }
        return myStr.toString();
    }
}