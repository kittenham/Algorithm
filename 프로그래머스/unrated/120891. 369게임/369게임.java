class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = order+"";
        char[] ch = orderStr.toCharArray();
        for(char od : ch){
            if(od=='3'||od=='6'||od=='9'){
                answer++;
            }
        }
        return answer;
    }
}