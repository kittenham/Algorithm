class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length();
        StringBuilder hiddenNum = new StringBuilder();

        for(int i=0; i<length-4; i++){
            hiddenNum.append("*");
        }
       
        hiddenNum.append(phone_number.substring(length-4));

        return hiddenNum.toString();
    }
}


//내 다른 풀이 추가
class Solution {
  public String solution(String phone_number) {
      String answer = "";

      for (int i = 0; i < phone_number.length() - 4; i++){
          answer += "*";
      }
      answer += phone_number.substring(phone_number.length() - 4);

      return answer;
  }
}


//다른 사람 풀이 추가 -1 (정규표현식 사용)
class Solution {
  public String solution(String phone_number) {
    return phone_number.replaceAll(".(?=.{4})", "*");
  }
}
/*정규표현식 해석
1. . : 임의의 문자 하나를 나타낸다.
2. (?=.{4}) : 긍정적 전방 탐색(Positive Lookahead)을 사용한 표현식으로, 이 부분은 뒤에 4개의 문자가 나오는지 검사한다.
3. replaceAll 메서드는 정규표현식 패턴에 일치하는 모든 부분을 찾아서 지정된 문자열인 "*" 로 대체한다. 
   따라서 문자열 phone_number에서 뒤에서 4자리를 제외한 모든 문자를 "*" 문자로 대체한다.
   예를 들어, phone_number가 "01012345678"일 경우, 정규표현식은 문자열에서 마지막 4자리 "5678"을 제외한 모든 문자를 "*"로 대체하여 "*******5678"을 반환한다.
*/


//다른사람 풀이추가 -2 (toCharArray() 사용)
class Solution {
  public String solution(String phone_number) {
     char[] ch = phone_number.toCharArray();
     for(int i = 0; i < ch.length - 4; i++){
         ch[i] = '*';
     }
     return String.valueOf(ch);
  }
}




