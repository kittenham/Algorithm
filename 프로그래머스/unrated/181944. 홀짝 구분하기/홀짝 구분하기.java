import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        if(n%2==0){
            System.out.print(n+" is even");
        } else{
            System.out.print(n+" is odd");
        }
    }
}


/*다른풀이 - 삼항연산자 이용
System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
*/


