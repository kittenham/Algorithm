class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(int i=0; i<num_str.length(); i++){
            char char_str = num_str.charAt(i);
            int int_str = Integer.parseInt(String.valueOf(char_str));
            answer += int_str;
        }
        return answer;
    }
}