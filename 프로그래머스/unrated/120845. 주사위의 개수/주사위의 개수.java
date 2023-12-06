class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        int nok=0;
        
        for(int i=0; i<box.length; i++){
            nok = box[i]/n;
            answer *= nok;
        }
        
        return answer;
    }
}