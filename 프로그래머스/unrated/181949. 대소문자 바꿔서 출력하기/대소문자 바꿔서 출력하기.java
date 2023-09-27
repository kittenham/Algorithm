import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";

        for (int i=0; i<a.length(); i++) {
            char c = a.charAt(i);

            if (Character.isUpperCase(c)) { //대문자인지 확인
                result += Character.toLowerCase(c); //소문자로 바꿈
            } else if (Character.isLowerCase(c)) { //소문자인지 확인
                result += Character.toUpperCase(c); //대문자로 바꿈
            }
        }

        System.out.println(result);
    }
}


/*
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";

        //Stack <Character> stack = new Stack <> ();

        for(Character c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                //stack.push(Character.toLowerCase(c));
                answer += Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                //stack.push(Character.toUpperCase(c));
                answer += Character.toUpperCase(c);
            }
        } 
        System.out.println(answer);
    }
}
*/


