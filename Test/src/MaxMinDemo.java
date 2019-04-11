import java.util.Arrays;

public class MaxMinDemo {

    public static void main(String[] args) {
        //随机生成一个数组，求里面的最大值和最小值
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ((int)(Math.random() * 10000)) % 1001; //随机生成1-1000的数字
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "，");
        }
        System.out.println();
        //求最大值和最小值
        //1、假设第一个元素是最大值/最小值
        //2、拿最大值/最小值在数组中逐个比较，如果某个元素比最大值还大，

        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max) {//如果数组中的某个元素大于max
                max = nums[i];
            }
            if(min > nums[i]) {
                min = nums[i];
            }
        }
        System.out.println("数组中的最大值是：" + max);
        System.out.println("数组中的最小值是：" + min);
    }

}
