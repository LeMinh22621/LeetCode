public class RunningSumArray {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        RunningSumArray obj = new RunningSumArray();
        int[] nums = { 3, 1, 2, 10, 1 };
        for (int i : obj.runningSum(nums))
            System.out.print(i + ",");
    }
}
