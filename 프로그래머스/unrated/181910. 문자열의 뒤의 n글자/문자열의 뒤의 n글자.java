class Solution {
    public String solution(String my_string, int n) {
        if(my_string.length()<n){
            return my_string;
        } else{
            int startIdx = my_string.length()-n;
            return my_string.substring(startIdx);
        }
    }
}