class Solution {
    public int solution(int a, int b) {

        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);

        String cStr = aStr+bStr;
        String dStr = bStr+aStr;

        int result1 = Integer.parseInt(cStr);
        int result2 = Integer.parseInt(dStr);

        if(result1>=result2){
            return result1;
        } else{
            return result2;
        }

    }
}