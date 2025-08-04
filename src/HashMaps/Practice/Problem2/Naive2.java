package HashMaps.Practice.Problem2;

import java.util.ArrayList;
import java.util.Arrays;

public class Naive2 {
    public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> answer = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            int val;
            if (arr1[i] < arr2[j]) {
                val = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                val = arr2[j++];
            } else {
                val = arr1[i];
                i++;
                j++;
            }

            if (answer.isEmpty() || answer.get(answer.size() - 1) != val) {
                answer.add(val);
            }
        }

        // Process remaining elements of arr1
        while (i < arr1.length) {
            if (answer.isEmpty() || answer.get(answer.size() - 1) != arr1[i]) {
                answer.add(arr1[i]);
            }
            i++;
        }

        // Process remaining elements of arr2
        while (j < arr2.length) {
            if (answer.isEmpty() || answer.get(answer.size() - 1) != arr2[j]) {
                answer.add(arr2[j]);
            }
            j++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {3, 4, 5, 2};
        System.out.println(union(arr1, arr2)); // Output: [1, 2, 3, 4, 5, 6]
    }
}
