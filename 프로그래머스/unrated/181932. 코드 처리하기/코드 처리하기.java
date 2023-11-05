class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for(int idx=0; idx<code.length(); idx++){
            char c = code.charAt(idx);
            if(mode==0){
                if(c != '1'){
                    if(idx%2==0){
                        ret += c;
                    }
                } else {
                    mode = 1;
                }
            } else{
                if(c != '1'){
                    if(idx%2!=0){
                        ret += c;
                    }
                } else{
                    mode = 0;
                }
            }
        }

        if(ret.length() == 0){
            return "EMPTY";
        }
        return ret;
    }
}