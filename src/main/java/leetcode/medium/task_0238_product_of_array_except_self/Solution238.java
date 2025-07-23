package leetcode.medium.task_0238_product_of_array_except_self;

public class Solution238 {

    public int [] productExceptSelf(int[] nums){
        long product = 1;
        int zeros = 0;
        int zeroIndex = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0){
                zeros++;
                if (zeros >1){
                    return new int[nums.length];
                }
                zeroIndex = j;
            } else {
                product*=nums[j];
            }
        }

        int [] products = new int[nums.length];
        if (zeros !=0){
            products[zeroIndex]=(int)product;
        } else {
            for (int i = 0; i < nums.length; i++) {
                products[i] = (int)product/nums[i];
            }
        }
        return products;
    }
}
