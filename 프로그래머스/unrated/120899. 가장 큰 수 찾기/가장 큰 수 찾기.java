class Solution {
    public int[] solution(int[] array) {
        int maxNum = Integer.MIN_VALUE;
        int maxIdx = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                maxIdx = i;
            }
        }

        int[] answer = {maxNum, maxIdx};
        return answer;
    }
}