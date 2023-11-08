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

