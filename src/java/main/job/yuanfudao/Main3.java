package main.job.yuanfudao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

    public static List<String> list = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        sc.nextLine();

        char[] array1 = sc.nextLine().toCharArray();
        char[] array2 = sc.nextLine().toCharArray();

        list = helper(n);

        System.out.println(helper(array1, array2, m, k));


    }

    public static List<String> helper(int n){
        if(n == 1){
            List<String> list = new ArrayList<>();
            list.add("A");
            list.add("B");
            list.add("C");
            return list;
        }else{
            List<String> tmp = helper(n - 1);
            List<String> list = new ArrayList<>();
            for(String str : tmp){
                list.add(str + "A");
                list.add(str + "B");
                list.add(str + "C");
            }
            return list;
        }
    }

    public static int helper(char[] array1, char[] array2, int m, int k){
        if(m == 1){
            int num = 0;
            for(int i = 0; i < array1.length; i++){
                if(array1[i] != array2[i]){
                    num ++;
                }
            }
            if(num != k){
                return 0;
            }else{
                return 1;
            }
        }else{
            int sum = 0;
            for(int i = 0; i < list.size(); i++){
                String str = list.get(i);
                sum += (helper(array1, str.toCharArray(), m- 1, k) * helper(str.toCharArray(), array2, 1, k));
                sum = sum % 1000000007;
            }
            return sum % 1000000007;


//            return helper(array1, "AAA".toCharArray(), m - 1, k) * helper("AAA".toCharArray(), array2, 1, k) +
//            helper(array1, "AAB".toCharArray(), m - 1, k) * helper("AAB".toCharArray(), array2, 1, k) +
//            helper(array1, "AAC".toCharArray(), m - 1, k) * helper("AAC".toCharArray(), array2, 1, k) +
//            helper(array1, "ABA".toCharArray(), m - 1, k) * helper("ABA".toCharArray(), array2, 1, k) +
//            helper(array1, "ABB".toCharArray(), m - 1, k) * helper("ABB".toCharArray(), array2, 1, k) +
//            helper(array1, "ABC".toCharArray(), m - 1, k) * helper("ABC".toCharArray(), array2, 1, k) +
//            helper(array1, "BAA".toCharArray(), m - 1, k) * helper("BAA".toCharArray(), array2, 1, k) +
//            helper(array1, "BAB".toCharArray(), m - 1, k) * helper("BAB".toCharArray(), array2, 1, k) +
//            helper(array1, "BAC".toCharArray(), m - 1, k) * helper("BAC".toCharArray(), array2, 1, k) +
//            helper(array1, "BBA".toCharArray(), m - 1, k) * helper("BBA".toCharArray(), array2, 1, k) +
//            helper(array1, "BBB".toCharArray(), m - 1, k) * helper("BBB".toCharArray(), array2, 1, k) +
//            helper(array1, "BBC".toCharArray(), m - 1, k) * helper("BBC".toCharArray(), array2, 1, k) +
//            helper(array1, "BCA".toCharArray(), m - 1, k) * helper("BCA".toCharArray(), array2, 1, k) +
//            helper(array1, "BCB".toCharArray(), m - 1, k) * helper("BCB".toCharArray(), array2, 1, k) +
//            helper(array1, "BCC".toCharArray(), m - 1, k) * helper("BCC".toCharArray(), array2, 1, k) +
//            helper(array1, "CAA".toCharArray(), m - 1, k) * helper("CAA".toCharArray(), array2, 1, k) +
//            helper(array1, "CAB".toCharArray(), m - 1, k) * helper("CAB".toCharArray(), array2, 1, k) +
//            helper(array1, "CAC".toCharArray(), m - 1, k) * helper("CAC".toCharArray(), array2, 1, k) +
//            helper(array1, "CBA".toCharArray(), m - 1, k) * helper("CBA".toCharArray(), array2, 1, k) +
//            helper(array1, "CBB".toCharArray(), m - 1, k) * helper("CBB".toCharArray(), array2, 1, k) +
//            helper(array1, "CBC".toCharArray(), m - 1, k) * helper("CBC".toCharArray(), array2, 1, k) +
//            helper(array1, "CCC".toCharArray(), m - 1, k) * helper("CCC".toCharArray(), array2, 1, k) +
//            helper(array1, "ACA".toCharArray(), m - 1, k) * helper("ACA".toCharArray(), array2, 1, k) +
//            helper(array1, "ACB".toCharArray(), m - 1, k) * helper("ACB".toCharArray(), array2, 1, k) +
//            helper(array1, "ACC".toCharArray(), m - 1, k) * helper("ACC".toCharArray(), array2, 1, k) +
//            helper(array1, "CCA".toCharArray(), m - 1, k) * helper("CCA".toCharArray(), array2, 1, k) +
//            helper(array1, "CCB".toCharArray(), m - 1, k) * helper("CCB".toCharArray(), array2, 1, k);
        }
    }
}
