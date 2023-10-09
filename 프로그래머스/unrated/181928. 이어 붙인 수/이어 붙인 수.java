class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for(int num : num_list){
            if(num%2==0){
               //이어붙인수가 되기 때문에 짝수합에서*10을 하여 일의 자리를 비게 한 후 그 자리에 num 숫자를 집어넣으면 이어붙인 것처럼 숫자가 나온다.
                even = even*10 + num;
            } else{
                odd = odd*10 + num;
            }
        }
        return odd+even;
    }
}


//다른풀이
/*문자열로 숫자들을 이어붙인 후 다시 숫자로 변환하기*/
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "", even = ""; //문자열로 변환

        for ( int i = 0; i < num_list.length; i++ ) {
            if ( num_list[i] % 2 == 0 ) {
                even += num_list[i];
            } else odd += num_list[i];
        }

        answer = Integer.parseInt(odd) + Integer.parseInt(even);  //숫자로 변환

        return answer;
    }
}

