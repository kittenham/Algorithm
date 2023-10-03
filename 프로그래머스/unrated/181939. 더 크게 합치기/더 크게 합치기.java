class Solution {
    public int solution(int a, int b) {
        //정수를 문자열로 변환
        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);

        String cStr = aStr+bStr;  //a ⊕ b
        String dStr = bStr+aStr;  //b ⊕ a

        //다시 문자열을 정수로 변환
        int result1 = Integer.parseInt(cStr);
        int result2 = Integer.parseInt(dStr);

        if(result1>=result2){
            return result1;
        } else{
            return result2;
        }
    }
}


/*다른사람 풀이*/
/*
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        answer = aLong > bLong ? aLong : bLong;

        return answer;
    }
}
*/


