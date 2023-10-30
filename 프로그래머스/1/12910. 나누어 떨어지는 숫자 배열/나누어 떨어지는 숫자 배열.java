import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int num : arr){
            if(num%divisor==0){
                result.add(num);
            }
        }
        
        if(result.isEmpty()){
            return new int[]{-1};
        }

        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        
        Arrays.sort(answer);

        return answer;
    }
}


//다른사람 풀이
import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr, int divisor) {
          int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
          if(answer.length == 0) answer = new int[] {-1};
          java.util.Arrays.sort(answer);
          return answer;
  }
}

