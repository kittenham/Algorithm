class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];


        for(int i=0; i<str.length(); i++){
            char nchar = str.charAt(i);
            int num = Character.getNumericValue(nchar);
            answer[str.length()-i-1] = num;
        }
        return answer;
    }
}