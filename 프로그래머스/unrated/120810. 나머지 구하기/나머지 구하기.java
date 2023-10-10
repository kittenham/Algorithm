class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1%num2;
        return answer;
    }
}


/*다른사람 풀이*/
class Solution {
    public int solution(int num1, int num2) {
        while (num1 >= num2) {
            num1 = num1 - num2;
        }
        int answer = num1;
        return answer;
    }
}
