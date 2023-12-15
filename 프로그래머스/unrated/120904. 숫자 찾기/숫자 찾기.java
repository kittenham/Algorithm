class Solution {
    public int solution(int num, int k) {
        String num2 = num+"";
        char[] n1 = num2.toCharArray();
        for(int i=0; i<n1.length; i++){
            if(Character.getNumericValue(n1[i]) == k){
                return i+1;
            }
        }
        return -1;
    }
}