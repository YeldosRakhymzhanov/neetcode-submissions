class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] + nums[j] == target){
                    if(i < j){
                        a[0] = i;
                        a[1] = j;
                    }else{
                        a[0] = j;
                        a[1] = i;
                    }
                }
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] nums = {3, 4, 5, 6};
        int target = 7;
        System.out.println(twoSum(nums, target));
    }
}
