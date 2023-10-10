class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int sumNumer = numer1*denom2 + numer2*denom1; //분자합
        int commDenom = denom1*denom2; //공통분모

        int gcd = getGcd(sumNumer, commDenom); //최대공약수
        int[] answer = {sumNumer/gcd, commDenom/gcd};

        return answer;
    }

    private int getGcd(int a, int b){
        if(b==0){
            return a;
        }
        return getGcd(b, a%b);
    }
}