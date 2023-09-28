class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        //인덱스 
        int index = s+overwrite_string.length();

        //answer는 0부터 s전까지 그리고 s부터 overwrite_string의 문자로 index만큼 바꾼다.
        answer = my_string.substring(0,s)+overwrite_string+my_string.substring(index);
        return answer;
    }
}


/*다른풀이
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        
        return before + overwrite_string + after;
    }
}
*/


