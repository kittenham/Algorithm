class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(a%2!=0 && b%2!=0){
            answer = a*a + b*b;
        } else if(a%2!=0 || b%2!=0){
            answer = 2*(a+b);
        } else{
            answer = Math.abs(a-b);
        }
        return answer;
    }
}


//부호를 무효화시키는 함수인 answer = Math.abs(a-b);는 아래와같이도 표현할 수 있다.
if(a<b){
     answer= b-a;
} else{
     answer=a-b;
}
