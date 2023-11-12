class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(i*i==n){
                    answer++;
                } else{
                    answer += 2;
                }
            }
        }
        return answer;
    }
}


/*풀이
1. 순서쌍의 개수를 기록하는 변수 answer를 초기화
2. n의 약수를 찾기 위해 for문을 이용하여 1부터 n제곱급까지 숫자를 반복
3. if문을 이용하여 숫자가 n의 약수인지 확인한다. 만약 n이 약수라면 두번째 약수도 자연수여야 하므로 이를 확인한다.
4. 만약 두 약수가 같다면 answer를 1증가시킨다. 하지만 두 약수가 다르면 count를 2개 증가시킨다.
   (ex. 두 약수가 같을때 : (5,5) => 1개, 두 약수가 다를때 : (1,10),(10,1) => 2개 가 나오기 때문)
5. answer값을 반환한다.
*/

//조금 복잡하게 풀어봤지만, 더 간단하게 푸는 방법으로는 아래와같다.
//아래는 위 풀이의 2,4번을 제외하고 단순하게 숫자반복을 통해 만든 알고리즘이다.
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            if(n%i==0){
                    answer++;
                }
            }

        return answer;
    }
}
