package easy;

public class TwoSum {

    public static void main(String[] args) {
        int [] testArray= new int[2];
        testArray[0] = 3;
        testArray[1] = 3;
        twoSum(testArray, 6);
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] arrayPositions = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    arrayPositions[0] = i;
                    arrayPositions[1] = j;
                    break;
                }
            }
        }
        return arrayPositions;
    }
}
