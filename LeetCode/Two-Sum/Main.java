public class Main {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        for (int i = 0; i <= nums.length-1; i++) {
            System.out.println("i = " + i);
            for (int j = 0; j <= nums.length-1; j++) {
                System.out.println("j = " + j);
                if(i!=j) {
                    if (target == nums[i] + nums[j]){
                        result[0] = i;
                        result[1] = j;
                        return result;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] result = twoSum(nums, 6);
        System.out.println("[ " + result[0] + ", " + result[1] + " ]");
    }
}