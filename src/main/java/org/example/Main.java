package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static int removeDuplicates(int[] nums) {
        LinkedList<Integer> ans = new LinkedList<>();
        if (nums.length != 0) {
            ans.add(nums[0]);
        } else return 0;

        for (int num : nums) {
            if (ans.getLast() != num) {
                ans.add(num);
            }
        }
        int k = ans.size();

        for (int i = 0; i < k; i++) {
            nums[i] = ans.pollFirst();
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}