package easy;

import java.util.Arrays;

public class MajorityNumber {

    public static void main(String[] args) {
        int[] ints = new int[3];
        ints[0] = 3;
        ints[1] = 2;
        ints[2] = 3;
        System.out.println(majorityElement(ints));
        System.out.println(majorityElementWithSort(ints));
    }

    public static int majorityElement(int[] nums) {
        int number;
        int halfLength = nums.length / 2;
        int fullLength = nums.length;
        for (int i = 0; i < fullLength; i++) {
            number = 0;
            for (int j = 0; j < fullLength; j++) {
                if (nums[j] == nums[i]) {
                    number++;
                }
            }
            if (number > halfLength) {
                return nums[i];
            }
        }
        return 0;
    }

    public static int majorityElementWithSort(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

}
