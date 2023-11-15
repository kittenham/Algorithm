class Solution {
    public String solution(String my_string, int n) {
        //길이가 n배인 StringBuilder를 생성하여 문자열을 구성
        StringBuilder answer = new StringBuilder(my_string.length()*n);
        //문자열의 각 문자에 대해 반복하여 추가
        for(int i=0; i<my_string.length(); i++){
            char my = my_string.charAt(i);
            
            //문자 n번 반복하고 StringBuilder에 추가
            for(int j=0; j<n; j++){
                answer.append(my);
            }
        }
        
        //최종문자열 반환
        return answer.toString();
    }
}