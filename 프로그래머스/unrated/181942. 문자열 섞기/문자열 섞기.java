class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int length = str1.length();

        for(int i = 0; i<length; i++){
            answer+=str1.charAt(i);
            answer+=str2.charAt(i);
        }

        return answer;
    }
}