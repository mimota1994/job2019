package main.job.PinDuoDuoXueBa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");

        Map<String,String> map = new HashMap<>();
        LinkedList<String> list = new LinkedList<>();
        for(int i = 0; i < strs.length; i++){
            map.put(strs[i].substring(0, 1), strs[i]);
            list.add(strs[i]);
        }

        String str = list.peekFirst();
        while(!list.isEmpty()){
            String tmp = map.get(str.substring(str.length() - 1, str.length()));
            if(tmp == null){
                System.out.println(false);
                return;
            }
            list.remove(str);
            str = tmp;
        }

        System.out.println(true);
    }
}
