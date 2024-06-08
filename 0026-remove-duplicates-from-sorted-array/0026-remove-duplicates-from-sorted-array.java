import java.util.*;

class Solution {
    public static final int removeDuplicates(
        final int[] nums
    ) {

        int i = 0;

        for (int num : nums)
            if (i == 0 || num > nums[i - 1]) {
                nums[i++] = num;
            }

        return i;
    }
}


class b {
    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates(new int[] { 1, 1, 2}));
        System.out.println(new Solution().removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}