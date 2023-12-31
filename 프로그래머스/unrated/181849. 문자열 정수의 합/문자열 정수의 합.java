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

//나의 다른풀이
int int_str = Integer.parseInt(String.valueOf(char_str)); 대신에
int int_str = Character.getNumericValue(char_str); 를 사용할 수도 있다. 실행시간은 비슷함.


