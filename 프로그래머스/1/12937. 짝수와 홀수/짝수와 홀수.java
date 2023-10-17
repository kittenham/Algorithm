class Solution {
    public String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer = "Even";
        } else{
            answer = "Odd";
        }
        return answer;
    }
}


//다른풀이
class Solution {
    public String solution(int num) {
        return (num%2==0) ? "Even" : "Odd";
    }
}

