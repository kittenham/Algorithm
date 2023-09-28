class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        //두 문자열의 길이가 같은 것이 제한사항이기 때문에 str1을 그냥 사용했음.
        for(int i = 0; i<str1.length(); i++){ 
            answer+=str1.charAt(i);
            answer+=str2.charAt(i);
        }
        return answer;
    }
}

/*
<내가 생각한 다른 풀이>
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        //두 문자열의 길이가 같은 것이 제한사항이기 때문에 str1을 그냥 사용했음.
        for(int i = 0; i<str1.length(); i++){ 
            result.append(str1.charAt(i));
            result.append(str2.charAt(i));
        }
        return answer;
    }
}
*/

/*
<다른사람의 풀이>
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";

        int length = str1.length();
        String[] str1arr = str1.split("");
        String[] str2arr = str2.split("");
        for (int i=0; i<length; i++) {
            answer += str1arr[i]+str2arr[i];
        }
        return answer;
    }
}

*/
