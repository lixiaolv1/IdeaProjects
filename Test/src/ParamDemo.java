public class ParamDemo {
    public static void main(String[] args){
//        paramTest("参数测试",1,2,3,4,5,6,7);
        paramTest("不传其他参数"); //编译器认为传了一个长度为0的整型数组
    }

    public static void paramTest(String str,int... nums){
        System.out.println("第一个参数："+ str );
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }
}
