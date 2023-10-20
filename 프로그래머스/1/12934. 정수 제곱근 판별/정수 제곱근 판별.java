class Solution {
    public long solution(long n) {
        long answer = 0;

        for(long i=0;i*i<=n;i++){
            if(i*i==n){
                answer =(i+1)*(i+1);
            }else
                answer =-1;
        }
        return answer;
    }
}


//다른사람 풀이
class Solution {
  public long solution(long n) {
      if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }

        return -1;
  }
}


