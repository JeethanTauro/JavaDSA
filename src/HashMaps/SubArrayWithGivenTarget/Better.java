package HashMaps.SubArrayWithGivenTarget;

import java.util.*;

public class Better {
    public static int[] findSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefix = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];

            // case 1: whole subarray from 0..i
            if (prefix == k) {
                return new int[]{0, i};
            }

            // case 2: prefix - k seen before
            if (map.containsKey(prefix - k)) {
                return new int[]{map.get(prefix - k) + 1, i};
            }

            // store prefix
            map.putIfAbsent(prefix, i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, -2, -20, 10};
        int k = -10;
        int[] res = findSubarray(arr, k);

        if (res != null) {
            System.out.println("Subarray with sum " + k + " found from " + res[0] + " to " + res[1]);
        } else {
            System.out.println("No subarray found");
        }
    }
}

