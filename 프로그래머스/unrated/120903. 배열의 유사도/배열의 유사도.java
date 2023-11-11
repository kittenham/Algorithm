//1. Set을 이용해 중복값 없애고 유사도 측정하기
import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for(String str : s1){
            set1.add(str);
        }

        for(String str: s2){
            set2.add(str);
        }

        //두 HashSet 교집합
        set1.retainAll(set2);

        //교집합 크기 반환
        return set1.size();
    }
}


//2. for 반복문 사용. + equals() 메소드를사용함.
//equals() 메소드가 아닌 ==을 사용하면 원하는 값이 출력되지 않음.
//이유는 문자열을 비교할때는 equals() 메소드를 사용해야 하기 때문이다. 
//==연산자는 두 문자열의 참조를 비교하는 것이 아니라 메모리 주소를 비교한다.

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s2.length; j++){
                if(s1[i].equals(s2[j])){
                    answer ++;
                }
            }
        }
        return answer;
    }
}

