package main.job.huawei;

import java.util.*;

public class Solution_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<String[]> matrix = new ArrayList();
        for(int i = 0; i < m; i++){
            matrix.add(sc.nextLine().split(","));
        }

        matrix.sort(new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return (Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]));
            }
        });

        for(int i = 0; i < matrix.size(); i++){
            List<String[]> list = (List<String[]>)matrix.clone();
            list.remove(i);
            if(!loop(list)){
                System.out.println(matrix.get(i)[2]);
            }
        }
        System.out.println("#");

    }

    public static boolean loop(List<String[]> matrix){
        int n = matrix.size();
        while(n >= 0){
            HashMap<String, Integer> map = new HashMap();
            for(int i = 0; i < matrix.size(); i++){
                if(map.containsKey(matrix.get(i)[0])){
                    map.put(matrix.get(i)[0], map.get(matrix.get(i)[0]) + 1);
                }else{
                    map.put(matrix.get(i)[0], 1);
                }

                if(map.containsKey(matrix.get(i)[1])){
                    map.put(matrix.get(i)[1], map.get(matrix.get(i)[1]) + 1);
                }else{
                    map.put(matrix.get(i)[1], 1);
                }
            }

            if(!map.containsValue(1)){
                break;
            }


            for(String str :map.keySet()){
                if(map.get(str) == 1){
                    for(int i = 0; i < matrix.size(); i++){
                        if(matrix.get(i)[0] == str || matrix.get(i)[1] == str){
                            matrix.remove(i);
                        }
                    }
                }
            }

        }

        if(matrix.size() != 0){
            return true;
        }else{
            return false;
        }
    }
}


