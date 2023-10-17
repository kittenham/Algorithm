import java.util.Arrays;

class Solution {
    public double solution(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        double answer = (double)sum/arr.length;
        return answer;
    }
}

//다른풀이
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum =0;
        for(int i : arr){
           sum += i;
        }
        answer = (double)sum/arr.length;
        return answer;
    }
}

