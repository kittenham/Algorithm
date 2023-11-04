class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        //finished에서 false인 값 구하기
        int falseCnt = 0;
        for(boolean f : finished){
            if(!f){
                falseCnt++;
            }
        }
     
        //결과 배열 초기화
        String[] answer = new String[falseCnt];
        
        //결과 배열에 false 값 복사
        int answerIdx = 0;
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]){
                answer[answerIdx] = todo_list[i];
                answerIdx++;
            }
        }
        return answer;
    }
}