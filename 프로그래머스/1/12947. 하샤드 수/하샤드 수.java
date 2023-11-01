class Solution {
    public boolean solution(int x) {
        String str = x+"";
        int sumx = 0;
        for(int i=0; i<str.length(); i++){
            char a = str.charAt(i);
            int digit = Character.getNumericValue(a);
            sumx += digit;
        }
        
        return x%sumx == 0;
    }
}