class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number%n==0 && number%m==0){
            answer = 1;
        } else { 
            answer = 0;
        }
        return answer;
    }
}


/*나의 다른 풀이*/
/* => 삼항연산 사용
class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        return number%n==0 && number%m==0 ? 1 : 0;
    }
}
*/


