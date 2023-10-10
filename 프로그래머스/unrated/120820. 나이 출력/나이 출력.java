class Solution {
    public int solution(int age) {
        int answer = 2022-age+1;
        return answer;
    }
}


/*다른사람 풀이*/
import java.time.*;
class Solution {
    public int solution(int age) {
        LocalDate today = LocalDate.now();
        return today.getYear() - age + 1;
    }
}
