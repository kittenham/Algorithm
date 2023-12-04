class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        char[] my_str = my_string.toCharArray();
        
        char temp = my_str[num1];
        my_str[num1] = my_str[num2];
        my_str[num2] = temp;
        
        return new String(my_str);
    }
}