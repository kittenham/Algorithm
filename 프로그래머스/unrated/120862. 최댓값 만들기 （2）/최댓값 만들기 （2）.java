class Solution {
    public int solution(int[] numbers) {
        int n = numbers.length;
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int product = numbers[i] * numbers[j];
                if (answer < product) {
                    answer = product;
                }
            }
        }

        return answer;
    }
}