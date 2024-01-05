import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
public static void main(String[] args) throws IOException{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int n = Integer.parseInt(br.readLine());

//각 계단의 점수를 저장하는 배열. (처음 사용자가 입력하는 점수를 저장하는 배열이다)
int[] stairs = new int[n+1];

//각 계단의 점수를 입력받음
for(int i=1; i<=n; i++){
  stairs[i] = Integer.parseInt(br.readLine());
}

//각 계단까지의 최대점수를 저장하는 배열 (코딩으로 계산되어져 저장된다.)
int[] dp = new int[n+1];

//첫번째 계단의 최대점수는 계단의 첫번째 점수와 같다.(더해지는 값이 없기 때문)
dp[1] = stairs[1];

//동적 계획법을 사용하여 각 계단까지의 최대점수를 계산한다.
for(int i=2; i<=n; i++){
  if(i==2){
    dp[2] = stairs[1]+stairs[2];
  } else if(n==3){
    //계단을 연속으로 한계단씩 세번을 오를 수 없다. 따라서, 세번째 계단은 첫번째와 두번째 계단 중 큰 값과 세번째 계단의 합이 최대인 점수를 구한다.
    dp[3] = Math.max(stairs[1], stairs[2])+stairs[3];
  } else{
    //현재계단까지의 최대점수는 [(현재계단-3)까지의 최대점수+(현재계단-1)의 점수] 와 [(현재계단-2)까지의 최대점수] 둘 중 큰 값과 [현재계단 값]의 합을 구하면 된다.
    dp[i] = Math.max(dp[i-3]+stairs[i-1], dp[i-2])+stairs[i];
  }
}

//마지막 계단까지의 최대점수가 답
System.out.println(dp[n]);

}
}