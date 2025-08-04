package Backtracking.UniquePermutationsOfAstring;

import java.util.ArrayList;

public class RecursiveMethod {

    public static ArrayList<String> permute(StringBuilder ip, StringBuilder op, ArrayList<String> list) {
        if (ip.length() == 0) {
            list.add(op.toString());  // Add a copy of result
            return list;
        }

        for (int i = 0; i < ip.length(); i++) {
            // Create new input and output
            StringBuilder newIp = new StringBuilder(ip);
            StringBuilder newOp = new StringBuilder(op);

            char ch = newIp.charAt(i);
            newOp.append(ch);
            newIp.deleteCharAt(i);

            permute(newIp, newOp, list);
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        StringBuilder input = new StringBuilder("abc");

        permute(input, output, list);
        System.out.println(list);
    }
}
