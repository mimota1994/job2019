package main.leecode;

public class Solution_8 {

    public int myAtoi(String str) {

        str = str.trim();

        if(str == null || str.length() == 0){
            return 0;
        }

        char head = str.charAt(0);
        long result = 0;
        boolean isOver = false;
        if(head == '-' || head == '+' || (head - '0' >= 0 && head - '0' <= 9)){
            int i = 0;
            if(head == '-'|| head == '+'){
                i ++;
            }
            for(;i < str.length(); i++){
                if(str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9){
                    long tmp = result * 10 + str.charAt(i) - '0';
                    if(tmp > Integer.MAX_VALUE){
                        isOver = true;
                        break;
                    }else{
                        result = (int)tmp;
                    }
                }else{
                    break;
                }
            }

            if(isOver){
                if(head == '-'){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }else{
                if(head == '-'){
                    return (int)result * -1;
                }else{
                    return (int)result;
                }
            }

        }else{
            return 0;
        }
    }
}
