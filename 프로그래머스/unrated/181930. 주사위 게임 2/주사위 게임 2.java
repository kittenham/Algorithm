class Solution {
    public int solution(int a, int b, int c) {
        int sum = a+b+c;
        int square = a*a + b*b + c*c;
        int triple = a*a*a + b*b*b + c*c*c;
        
        if(a==b && b==c){
            return sum*square*triple;
        } else if(a==b || a==c || b==c){
            return sum*square;
        } else{
            return sum;
        }
    }
}