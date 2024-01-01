class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int currentNum = 0;
        boolean isNumber = false;
        
        for(char c : my_string.toCharArray()){
            if(Character.isDigit(c)){
                currentNum = currentNum*10 + Character.getNumericValue(c);
                isNumber = true;
            } else{
                if(isNumber){
                    answer += currentNum;
                    currentNum = 0;
                    isNumber = false;
                }
            }
        }
        
        if(isNumber){
            answer += currentNum;
        }
        return answer;
    }
}