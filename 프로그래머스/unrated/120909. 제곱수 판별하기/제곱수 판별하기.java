class Solution {
    public int solution(int n) {
        int answer = 0;
        double a = Math.sqrt(n);
        answer = (a == (int)a) ? 1 : 2;
        return answer;
    }
}