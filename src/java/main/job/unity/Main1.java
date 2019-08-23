package main.job.unity;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split("-");
        String save1 = strs[0];
        String save2 = strs[1];
        String[] paper1 = strs[0].split(" ");
        String[] paper2 = strs[1].split(" ");

        Map<String, Integer> map = new HashMap<>();
        map.put("3", 1);
        map.put("4", 2);
        map.put("5", 3);
        map.put("6", 4);
        map.put("7", 5);
        map.put("8", 6);
        map.put("9", 7);
        map.put("10", 8);
        map.put("J", 9);
        map.put("Q", 10);
        map.put("K", 11);
        map.put("A", 12);
        map.put("2", 13);

        int boomNum = 0;
        List<String> list = new ArrayList<>();

        int i = 1;
        for(; i < paper1.length; i++){
            if(paper1[i].equals(paper1[i - 1])){
                continue;
            }else if(paper1[i].equals("joker") || paper1[i].equals("JOKER")){
                boomNum ++;
                list.add(save1);
                break;
            }else{
                break;
            }
        }
        if(i >= paper1.length && paper1.length == 4){
            boomNum ++;
            list.add(save1);
        }

        int j = 1;
        for(; j < paper2.length; j++){
            if(paper2[j].equals(paper2[j - 1])){
                continue;
            }else if(paper2[j].equals("joker") || paper2[j].equals("JOKER")){
                boomNum ++;
                list.add(save2);
                break;
            }else{
                break;
            }
        }
        if(j >= paper2.length && paper2.length == 4){
            boomNum ++;
            list.add(save2);
        }


        if(boomNum <= 0){
            if(paper1.length != paper2.length){
                System.out.println("ERROR");
                return;
            }else{
                if(map.get(paper1[0]) > map.get(paper2[0])){
                    System.out.println(save1);
                    return;
                }else{
                    System.out.println(save2);
                    return;
                }
            }
        }else if(boomNum == 1){
            System.out.println(list.get(0));
            return;
        }else{
            if(paper1[0].equals("joker") || paper1[0].equals("JOKER")){
                System.out.println(save1);
                return;
            }else if(paper2[0].equals("joker") || paper2[0].equals("JOKER")){
                System.out.println(save2);
                return;
            }

            if(map.get(paper1[0]) > map.get(paper2[0])){
                System.out.println(save1);
                return;
            }else{
                System.out.println(save2);
                return;
            }
        }
    }
}
