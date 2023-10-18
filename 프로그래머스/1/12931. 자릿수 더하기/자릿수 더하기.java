
public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n>0){
            answer += n%10;
            n /=10;
        }

        return answer;
    }
}


//다른사람풀이
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] array = String.valueOf(n).split("");
        for(String s : array){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}

