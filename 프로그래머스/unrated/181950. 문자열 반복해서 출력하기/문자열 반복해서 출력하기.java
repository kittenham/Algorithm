import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        String result = str.repeat(n);
        System.out.println(result);
    }
}


/*
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String answer = "";
        for (int i = 1; i <= n; i++) {
            answer += str;
        }
        System.out.println(answer);

    }
}
*/
