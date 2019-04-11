import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //首先要确定1-1000的所有质数

        int count = 0,k=0;
        int flag =0; //质数与否
        int[] nums = new int[168];
        ////
        for (int i = 2; i < 1000; i++) {//外层循环控制需要验证的数
            for (int j = 2; j < i;j++) {//内层控制除了那些数被整除
                ////
                if(i%j ==0) {
                    flag = 1;		//flag作为一个标识符来判断这个数是否需要添加到质数
                    break;
                }else {
                    flag = 0;
                }
                ////
            }
            ////
            if(flag == 0) {
                count++;	//共计168个质数，标准来应该此时创建一个一个count数的数组
                nums[k] = i;
                k++;
            }
            //// i = ++1;
        }
        //质数输入到数组完成，接下来可操作数组

        //定义一个输入值，判断这个值有多少个质数求和方式，输出方式数目
        Scanner input = new Scanner(System.in);
        System.out.println("请输入X的值:");
        int x = input.nextInt();
        int count2 = 0;
        for (int i = 0; i < 168; i++) {
//			x = nums[i]+ nums[j],count2 +1,
//					循环，直到循环结束，输出count2
            for (int j = 0; j < 168; j++) {
                if( x == (nums[i] + nums[j]) ) {
                    count2++;
                    System.out.println(nums[i]+" "+nums[j]);
//					if((nums[j] + nums[i])==((nums[i] + nums[j]))) {
//						count -=1;
//						System.out.println(i+" "+j);
//					}
                }
            }

        }
        if(count2 % 2 != 0) {
            count2 += 1;
        }
        System.out.println(count2/2);

    }

}
