class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] str = my_string.toCharArray();
        
        for(int i=0; i<str.length; i++){
            if(Character.isDigit(str[i])){
                answer += Character.getNumericValue(str[i]);
            }
        }
        
        return answer;
    }
}