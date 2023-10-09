class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int multiply = 1;
        for(int num : num_list){
            sum += num;
            multiply *= num;
        }
        int sum2 = sum*sum;
        if(sum2>multiply){
            return 1;
        } else{
            return 0;
        }
    }
}