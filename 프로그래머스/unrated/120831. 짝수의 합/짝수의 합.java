class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<=n; i++){
            if(i%2==0){
                answer += i;
            }
        }
        return answer;
    }
}


/*다른사람 풀이-1*/
class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){ //2부터 시작해서 i를 +2를 해서 짝수만 나오도록해서 더해주도록함
            answer+=i;
        }

        return answer;
    }
}


/*다른사람 풀이-2*/
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(0, n)
            .filter(e -> e % 2 == 0)
            .sum();
    }
}
