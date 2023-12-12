class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        
        String ageStr = Integer.toString(age);
        
        for(char num : ageStr.toCharArray()){
            int digit = num - '0';
            char convertChar = (char)('a'+digit);
            
            sb.append(convertChar);
        }
        return sb.toString();
    }
}