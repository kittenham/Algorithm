import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n*(n-1)];

        int idx = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=j){
                    answer[idx] = numbers[i]*numbers[j];
                    idx++;
                }
            }
        }
        Arrays.sort(answer);
        return answer[answer.length-1];
    }
}