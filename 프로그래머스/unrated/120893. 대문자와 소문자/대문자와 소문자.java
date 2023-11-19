class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char str : my_string.toCharArray()){
            answer += Character.isUpperCase(str) ? Character.toLowerCase(str) : Character.toUpperCase(str);

        }
        return answer;
    }
}