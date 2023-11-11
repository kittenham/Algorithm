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