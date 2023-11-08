class Solution {
    public String solution(String n_str) {
        int num = Integer.parseInt(n_str);
        String answer = num+"";
        return answer;
    }
}


//다른풀이
class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        int i = 0;
        while (i < n_str.length() && n_str.charAt(i) == '0') {
            i++;
        }
        
        while (i < n_str.length()) {
            answer += n_str.charAt(i);
            i++;
        }
        return answer;
    }
}
/*
초기 인덱스 i를 0으로 설정하고, 
charAt() 메서드로 n_str의 i 위치에 있는 문자를 가져와 가져온 문자가 0인 경우 i를 증가키고, 
0이 아닌 첫 번째 숫자를 찾으면 다음 while문에서 해당 위치부터 문자열의 끝까지의 문자를 answer에 추가
*/



