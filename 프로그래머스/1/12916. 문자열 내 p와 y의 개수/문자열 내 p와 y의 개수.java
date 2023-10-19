class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();
        
        int cntP = 0;
        int cntY = 0;

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'P'){
                cntP++;
            } else if(c == 'Y'){
                cntY++;
            }
        } 
        
        if(cntP==cntY){
            return true;
        } else if(cntP==0 && cntY==0){
            return true;
        } else {
            return false;
        }
    }
}