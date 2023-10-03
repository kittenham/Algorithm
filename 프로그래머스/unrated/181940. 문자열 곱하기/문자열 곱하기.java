class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i=0; i<k; i++){
            answer+=my_string;
        }
        return answer;
    }
}


/*나의 다른 풀이*/
/*
class Solution {
    public String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<k; i++){
            answer.append(my_string);
        }
        return answer.toString();
    }
}
*/



/*다른사람 풀이*/
/*
class Solution {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
*/


