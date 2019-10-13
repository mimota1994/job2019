package main.leecode;

public class Solution_1108 {

    public String defangIPaddr(String address) {
        StringBuilder sp = new StringBuilder();
        for(int i = 0; i < address.length(); i++){
            char c = address.charAt(i);
            if(c == '.'){
                sp.append('[');
            }
            sp.append(c);
            if(c == '.'){
                sp.append(']');
            }
        }

        return sp.toString();
    }
}
