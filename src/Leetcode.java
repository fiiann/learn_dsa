public class Leetcode {
    public static  void mainTwoSum(){
        int[] nums = {1,2,3,4,5,6};
        int target =11;
        int[] hasil = twoSum(nums, target);
        for (int i = 0; i < hasil.length; i++) {
            System.out.printf(hasil[i]+" ");
        }
    }
    public static int[]  twoSum(int[] nums, int target) {

        int panjang = nums.length;
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < panjang; j++) {
                if(nums[i]+nums[j] == target){
                   return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static int reverseDigits(int x) {
        int reverse = 0;
//        1234
        while(x != 0){
            int remain = x % 10; // isolate the last digit
            reverse = reverse * 10 + remain; //append last digit to reverse
            x = x/10; // remove last digit
        }
        return reverse;
    }
}
