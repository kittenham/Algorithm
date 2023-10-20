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