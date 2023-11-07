class Solution {
    public String solution(String my_string) {
        StringBuilder reversed = new StringBuilder(my_string);
        return reversed.reverse().toString();
    }
}


//나의 다른풀이 추가
class Solution {
    public String solution(String my_string) {
        String answer = "";

        for(int i=my_string.length()-1; i>=0; i--){
            answer+=my_string.charAt(i);
        }

        return answer;
    }
}

