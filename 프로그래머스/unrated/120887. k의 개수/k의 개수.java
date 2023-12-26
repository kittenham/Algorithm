class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String k2 = k+"";
        for(int n=i; i<=j; i++){
            String n2 = i+"";
            char[] n3 = n2.toCharArray();
            for(char num : n3){
                if(num==k2.charAt(0)){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}