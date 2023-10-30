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