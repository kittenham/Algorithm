class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n%slice == 0){
            answer = n/slice;
        } else{
            answer = n/slice+1;
        }
        return answer;
    }
}


//나의 다른 풀이 추가
class Solution {
    public int solution(int slice, int n) {
        return  (int) Math.ceil((double) n / slice);
    }
}
