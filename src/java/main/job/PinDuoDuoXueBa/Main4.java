package main.job.PinDuoDuoXueBa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main4 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bf.readLine();
        String[] strs = bf.readLine().split(" ");
        int[] array = new int[strs.length];
        for(int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(strs[i]);
        }

        strs = bf.readLine().split(" ");
        int[] tmps = new int[strs.length];
        for(int i = 0; i < tmps.length; i++){
            tmps[i] = Integer.parseInt(strs[i]);
        }

        Ji[] jis = new Ji[strs.length];
        for(int i = 0; i < strs.length; i++){
            jis[i] = new Ji(array[i], tmps[i]);
        }

//        Arrays.sort(jis, (o1, o2) -> -o1.len + o2.len);
        Arrays.sort(jis, new Comparator<Ji>() {
            @Override
            public int compare(Ji o1, Ji o2) {
                if(o1.len > o2.len){
                    return 1;
                }else if(o1.len > o2.len){
                    return -1;
                }else{
                    if(o1.w > o2.w){
                        return 1;
                    }else if(o1.w < o2.w){
                        return -1;
                    }else{
                        return 0;
                    }
                }
            }
        });

//        System.out.println(helper(jis, 0).num);
        System.out.println(help(jis));


    }

    public static int help(Ji[] jis){
        Re[] res = new Re[jis.length];
        for(int i =0; i < res.length; i++){
            res[i] = new Re();
        }
        res[0] = new Re(1, jis[0].w);
        for(int i = 1; i < res.length; i++){
            Re re = new Re();
            for(int j = 0; j < i; j ++){
                if(jis[i].len > jis[j].len && res[j].w <= (7 * jis[i].w) && res[i].num < res[j].num){
                    re.w = res[j].w + jis[i].w;
                    re.num = res[j].num + 1;
                }
            }
            res[i] = re;
        }

        int max = 0;
        for(int i = res.length - 1; i >= 0; i--){
            if(res[i].num > max){
                max = res[i].num;
            }
        }

        return max;
    }

    public static Re helper(Ji[] jis, int index){
        Re result = new Re();

        if(index == jis.length - 1){
            result.num = 1;
            result.w = jis[index].w;
            return result;
        }

        for(int i = index + 1; i < jis.length; i ++){
            Re re = helper(jis, i);
            if(re.w <= (jis[index].w * 7) && result.num < re.num){
                result.w = re.w + jis[index].w;
                result.num = re.num + 1;
            }
        }

        return result;
    }
}

class Ji{
    int len;
    int w;
    public Ji(int len, int w){
        this.len = len;
        this.w = w;
    }
}

class Re{
    int num;
    int w;
    public Re(int num, int w){
        this.num = num;
        this.w = w;
    }
    public Re(){

    }
}
