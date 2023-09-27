class Solution {
    public String solution(String my_string, int n) {
        String answer = my_string.substring(0,Math.min(my_string.length(),n));
        return answer;
    }
}
/*
class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}
*/