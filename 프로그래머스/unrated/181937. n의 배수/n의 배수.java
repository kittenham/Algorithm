class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if(num>=2&&num<=100&&n>=2&&n<=9){
            if(num % n == 0){
                answer = 1;
            } else {
                answer = 0;
            }  
        }
        return answer;
    }
}

/*
class Solution {
    public int solution(int num, int n) {
        int answer = num % n == 0 ? 1 : 0;
        return answer;
    }
}
*/