package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindModeOptimised {

    public static int findMode(ArrayList<Integer> arr) {
        arr.sort(null); // Sort to bring equal elements together

        int mode = arr.get(0);
        int maxCount = 1;
        int currentCount = 1;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).equals(arr.get(i - 1))) {
                currentCount++;
            } else {
                currentCount = 1;
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                mode = arr.get(i);
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 7, 1, 1, 3, 2, 7, 7, 7, 7, 7, 1, 1, 5, 5, 7, 1, 3, 2, 5));
        int mode = findMode(arr);
        System.out.println("Mode: " + mode);
    }
}
