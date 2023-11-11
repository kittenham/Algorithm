class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                answer[0]++;
            } else{
                answer[1]++;
            }
        }
        return answer;
    }
}


//다른사람 풀이 추가
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;
               //숫자를 2로 나누면 0과 1만 나타나게 되고 answer배열의 자릿수도 2개이니 answer[0], answer[1] 밖에 되지 않아 식이 성립이 가능하다.

        return answer;
    }
}

