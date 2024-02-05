public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int [] nums = {2,7,11,15};
        int target = 9;

        int [] result = twoSum.solution(nums,target);
        if (result[0] != -1){
            System.out.println(result[0]+ " " +result[1]);
        }else {
            System.out.println("{-1, -1}");
        }
    }

    public int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
