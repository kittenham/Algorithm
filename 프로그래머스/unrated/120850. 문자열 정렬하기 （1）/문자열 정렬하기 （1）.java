import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int count = 0;
        
        for(char str : my_string.toCharArray()){
            if(Character.isDigit(str)){
                count++;
            }
        }
        
        int[] answer = new int[count];
        int idx = 0;
        for(char str : my_string.toCharArray()){
            if(Character.isDigit(str)){
                answer[idx++] = Character.getNumericValue(str);
            }
        } 
        
        Arrays.sort(answer);
        
        return answer;
    }
}