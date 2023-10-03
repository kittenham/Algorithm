class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(String str : arr){
            answer+= str;
        }
        return answer;
    }
}


/*나의 다른풀이*/
/*
class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}
*/


/*다른사람 풀이*/
/*
class Solution {
    public String solution(String[] arr) {
        return String.join("", arr);
    }
}
*/
