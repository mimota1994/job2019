package main.some;

public class Main1 {

    public static int compute(String str){
        char[] array = str.toCharArray();
        int sum = 0;
        for(int i = 0; i < array.length ; i++){
            int n = array[i] - 'A' + 1;
            sum  = sum * 26 + n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(compute("Z"));
    }
}
