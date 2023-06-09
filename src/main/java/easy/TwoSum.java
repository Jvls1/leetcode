package easy;

public class TwoSum {

    public static void main(String[] args) {
        int [] testArray= new int[4];
        testArray[0] = 2;
        testArray[1] = 4;
        testArray[2] = 11;
        testArray[3] = 3;
        twoSum(testArray, 6);
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
