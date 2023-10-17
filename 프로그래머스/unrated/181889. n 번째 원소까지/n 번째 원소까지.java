class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = Math.min(n, num_list.length);
        int[] answer = new int[length];
        for(int i=0; i<length; i++){
            if(i<n){
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}

//다른풀이1
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];

        for(int i=0; i<n;i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
}

//다른풀이2
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, 0, n);
    }
}

