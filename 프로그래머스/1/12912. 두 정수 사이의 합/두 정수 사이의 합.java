class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int i = min; i <= max; i++) {
            answer += i;
        }

        return answer;
    }
}


//다른사람 풀이 -1
class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      for (int i = ((a < b) ? a : b); i <= ((a < b) ? b : a); i++) 
          answer += i;

      return answer;
  }
}


//다른사람 풀이 -2 => 등자수열 합 공식((a1+an)/2 * n)으로 구하기
class Solution {

    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}


