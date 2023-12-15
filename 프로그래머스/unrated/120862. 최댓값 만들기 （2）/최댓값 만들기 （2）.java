class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = numbers[i] * numbers[j];
                if (product > answer) {
                    answer = product;
                }
            }
        }

        return answer;
    }
}