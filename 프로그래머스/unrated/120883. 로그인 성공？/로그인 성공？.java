class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String inputId = id_pw[0];
        String inputPw = id_pw[1];
        
        for(String[] member : db){
            String dbId = member[0];
            String dbPw = member[1];
            
            if(dbId.equals(inputId)&&dbPw.equals(inputPw)){
                return "login";
            } else if(dbId.equals(inputId)&&!dbPw.equals(inputPw)){
                return "wrong pw";
            }
        }
        return "fail";
    }
}