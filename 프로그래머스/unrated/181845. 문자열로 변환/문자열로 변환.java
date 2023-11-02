class Solution {
    public String solution(int n) {
        return Integer.toString(n);
    }
}

//다른풀이
class Solution {
    public String solution(int n) {
        return n+"";
    }
}

/*
첫번째 방법이 두번째 방법보다 처리속도가 훨씬 빠르다. 쉽기는 두번째가 더 쉽긴한데..ㅋㅋㅋ
첫번째방법은 0.02ms 정도 걸린다면 두번째 방법은 7.02ms 정도 걸린다.
*/
