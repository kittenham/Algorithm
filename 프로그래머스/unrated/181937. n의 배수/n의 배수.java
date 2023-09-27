class Solution {
    public static int solution(int num, int n) {
        if (num >= 2 && num <= 100 && n >= 2 && n <= 9) {
            if(num%n==0){
                return 1;
            } else{
                return 0;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int num = 98;
        int n = 2;
        int result = solution(num, n);
        System.out.println(result);
    }

}