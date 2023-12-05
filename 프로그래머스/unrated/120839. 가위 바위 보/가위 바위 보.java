class Solution {
    public String solution(String rsp) {
        
        char[] rspChar = rsp.toCharArray();
        char[] win = new char[rspChar.length];
        
        for(int i=0; i<rspChar.length; i++){
            if(rspChar[i]=='0'){
                win[i] = '5';
            } else if(rspChar[i]=='2'){
                win[i] = '0';
            } else{
                win[i] = '2';
            }
        }
        return new String(win);
    }
}