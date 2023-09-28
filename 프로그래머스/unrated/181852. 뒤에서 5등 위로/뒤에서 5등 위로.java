import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] sortedArray = Arrays.copyOf(num_list, num_list.length);
        Arrays.sort(sortedArray);

        int[] result = new int[num_list.length - 5];

        for (int i = 5; i < num_list.length; i++) {
            result[i - 5] = sortedArray[i];
        }

        return result;
    }
}