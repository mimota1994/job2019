package main.some;

import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个ip地址，但是.丢失了，现在需要你找到所有ip的可能性
 */
public class IpConvertor {

    public static void main(String[] args) {
        String str = "19216811";
//        List<List<Integer>> result = convert(str, 0, 4);

        List<List<Integer>> result = new LinkedList<>();
        convert(str, 0, 4, new LinkedList<>(), result);
        System.out.println();
    }

    public static List<List<Integer>> convert(String str, int index, int k) {
        if (index >= str.length() || k <= 0) {
            return new LinkedList<>();
        }
        if (index < str.length() && k == 1) {
            String s = str.substring(index);
            int t = Integer.parseInt(s);
            if (t >= 0 && t < 256) {
                List<Integer> temp = new LinkedList<Integer>();
                temp.add(Integer.parseInt(str.substring(index)));
                List<List<Integer>> result = new LinkedList<>();
                result.add(temp);
                return result;
            } else {
                return new LinkedList<>();
            }
        } else {
            List<List<Integer>> result = new LinkedList<>();
            int t1 = Integer.parseInt(str.substring(index, index + 1));
            if (t1 >= 0 && t1 < 256) {
                List<List<Integer>> temp = convert(str, index + 1, k - 1);
                for (int i = 0; i < temp.size(); i++) {
                    temp.get(i).add(t1);
                }
                result.addAll(temp);
            }

            if (index + 2 <= str.length()) {
                int t2 = Integer.parseInt(str.substring(index, index + 2));
                if (t2 >= 0 && t2 < 256) {
                    List<List<Integer>> temp = convert(str, index + 2, k - 1);
                    for (int i = 0; i < temp.size(); i++) {
                        temp.get(i).add(t2);
                    }
                    result.addAll(temp);
                }
            }

            if (index + 3 <= str.length()) {
                int t3 = Integer.parseInt(str.substring(index, index + 3));
                if (t3 >= 0 && t3 < 256) {
                    List<List<Integer>> temp = convert(str, index + 3, k - 1);
                    for (int i = 0; i < temp.size(); i++) {
                        temp.get(i).add(t3);
                    }
                    result.addAll(temp);
                }
            }
            return result;
        }
    }

    public static void convert(String str, int index, int k, List<Integer> temp, List<List<Integer>> result) {
        if (index >= str.length() || k < 0) {
            return;
        } else if (k == 1 && index < str.length()) {
            int t = Integer.parseInt(str.substring(index));
            if(t >= 0 && t < 256){
                temp.add(t);
                result.add(new LinkedList<>(temp));
                temp.remove(temp.size() - 1);
            }
            return;
        }else{
            int t1 = Integer.parseInt(str.substring(index, index + 1));
            if(t1 >= 0 && t1 < 256) {
                temp.add(t1);
                convert(str, index + 1, k - 1, temp, result);
                temp.remove(temp.size() - 1);

                if(index + 2 <= str.length()){
                    int t2 = Integer.parseInt(str.substring(index, index + 2));
                    if (t2 >= 0 && t2 < 256) {
                        temp.add(t2);
                        convert(str, index + 2, k - 1, temp, result);
                        temp.remove(temp.size() - 1);

                        if(index + 3 <= str.length()){
                            int t3 = Integer.parseInt(str.substring(index, index + 3));
                            if (t3 >= 0 && t3 < 256) {
                                temp.add(t3);
                                convert(str, index + 3, k - 1, temp, result);
                                temp.remove(temp.size() - 1);
                            }
                        }
                    }
                }
            }
        }
    }
}
