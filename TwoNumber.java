class TwoNumber {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && (arr[i] != -1 || arr[j] != -1)) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1)
                count++;
        }

        int[] indexs = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                indexs[j] = i;
                j++;
            }

        }
        return indexs;
    }
}