class Solution {
    public int solution(int[] numbers) {
        boolean[] yes = new boolean[10];  //0부터 9까지 숫자가 존재하는지 나타내는 배열
        int sum = 0;

        //존재하는 숫자 표시
        for(int num : numbers){
            if(num>=0 && num<=9){
                yes[num] = true;
            }
        }
        
        //존재하지 않는 숫자 찾아서 더하기
        for(int i=0; i<=9; i++){
            if(!yes[i]){
                sum+= i;
            }
        }
        
        return sum;
    }
}


//다른사람 풀이-1
//있는 숫자를 모두 더해서 빼주면됨..(와 진짜 생각도 못했는데ㅋㅋㅋ)
class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}


//다른사람 풀이-2
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        return 45-Arrays.stream(numbers).sum();
    }
}


