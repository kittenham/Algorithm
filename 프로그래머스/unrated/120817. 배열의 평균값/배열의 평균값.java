class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for(int i : numbers){
            sum += i;
        }
        answer = (double)sum/numbers.length;
        return answer;
    }
}


/*다른사람 풀이 - Stream으로 풀기*/
import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}

/*
.orElse 설명
.orElse(0) -> 주어진 값이 null이 아닌 경우 주어진 값을 되돌려주고 null인 경우 인수(0)을 돌려준다.
*/



