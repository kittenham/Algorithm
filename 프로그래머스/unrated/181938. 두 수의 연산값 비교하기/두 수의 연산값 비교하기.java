class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int c = Integer.parseInt(""+a+b);
        int d = 2*a*b;

        answer = (c>=d) ? c : d;
        return answer;
    }
}

/*다른사람 풀이*/
/*
class Solution {
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);
    }
}
*/

