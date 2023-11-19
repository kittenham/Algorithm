class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        
        int idx = 0;
        for(int i=1; i<=n; i+=2){
            answer[idx++] = i;
        }
        return answer;
    }
}



//Stream사용하는 풀이 추가
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}
