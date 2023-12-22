class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length;
        int row = len/n;
        int idx = 0;
        int[][] answer = new int[row][n];
        for(int i=0; i<row; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[idx++];
            }
        }
        return answer;
    }
}