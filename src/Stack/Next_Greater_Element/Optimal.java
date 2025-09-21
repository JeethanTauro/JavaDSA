package Stack.Next_Greater_Element;

import java.util.HashMap;
import java.util.Stack;

class Optimal {
    public HashMap<Integer,Integer> nextGreaterHelper(int[] arr){
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = arr.length-1;

        map.put(arr[i] , -1);
        stack.push(arr[i]);
        i = i-1;
        while(i >= 0){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                if(stack.peek()>arr[i]){
                    map.put(arr[i],stack.peek());
                }
            }
            if(stack.isEmpty()){
                map.put(arr[i],-1);
            }
            stack.push(arr[i]);
            i--;
        }
        return map;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = nextGreaterHelper(nums2);
        int[] result = new int[nums1.length];
        int i = 0;
        for(int num : nums1){
            result[i] = map.get(num);
            i++;
        }
        return result;

    }
}
