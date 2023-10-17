class Solution {
    public int[] solution(int[] num_list, int n) {
        int length = Math.min(n, num_list.length);
        int[] answer = new int[length];
        for(int i=0; i<length; i++){
            if(i<n){
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}