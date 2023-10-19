class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        
        int cntP = 0;
        int cntY = 0;

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'P'){
                cntP++;
            } else if(c == 'Y'){
                cntY++;
            }
        } 
        
        if(cntP==cntY){
            return true;
        } else if(cntP==0 && cntY==0){
            return true;
        } else {
            return false;
        }
    }
}


//다른사람 풀이
class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();

        // 'P'와 'Y'의 개수를 각각 세고, 개수를 비교하여 같으면 true를 반환
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}
/* s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count(); 자세히 설명

1. `s.chars()` 메서드를 사용하여 문자열 s를 문자 스트림으로 변환한다. 이 스트림은 문자열의 모든 문자를 하나씩 처리하는데 사용된다.
2. `.filter(e -> 'P' == e)` 메서드를 사용하여 문자 스트림에서 'P'인 문자만 필터링한다. 이 부분은 'P' 문자만을 가지고 있는 스트림을 생성한다.
3. `.count()` 메서드를 사용하여 필터링된 문자 스트림의 요소 개수를 세어 반환한다. 이 부분은 'P' 문자가 문자열 s에서 몇 번 나타나는지를 세는 것이다.
4. 마찬가지로, 두 번째 줄은 'Y' 문자의 개수를 세어준다.
5. 마지막으로, 두 개수가 같은지를 비교하고, 두 개수가 같으면 true를 반환하고 다르면 false를 반환합니다.





*/



