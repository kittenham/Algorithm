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

/*
아 솔직히 너무 어려웠음
시간이 오래걸렸던 이유 => import java.util.Arrays; 얘를 안넣어서 Arrays가 적용이 안되었다.
*/

/*
다른사람 풀이1)
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        return Arrays.stream(numList).sorted().skip(5).toArray();
    }
}

다른사람 풀이2)
import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        answer = Arrays.copyOfRange(num_list,5,num_list.length);
        return answer;
    }
}
*/
