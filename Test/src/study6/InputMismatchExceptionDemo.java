package study6;
/*
 * 输入不匹配异常示例
 * 用户输入的年龄只能是整型数字，使用异常处理机制捕获并处理异常情况
 */

import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年龄，必须是整型数字");
        int age = -1;
        try {
            age = input.nextInt();
            age = age / 10;
        }catch (ArithmeticException e){
            //此处报错是因为上面使用了Exception，作为父类，已经捕获完所有异常的父类，所以无法再执行子类异常
            //所以最好的方式将捕获子类异常放在上面，后面如果没有捕获到，再捕获所有异常
            e.printStackTrace();
        }catch (Exception e){
            //以堆栈的方式打印，一般在开发的时候使用，更容易调试
            e.printStackTrace();
            //e.printStackTrace(System.err);//这是等价的写法，直接看方法定义就明白了，这方法是在Throwable里定义的

            //System.err.println(e.getMessage());
            //此处使用err，不使用out，因为err的文字提示是红色的
        }finally {
            //将无论如何都要执行的代码放入finally
            System.out.println("输入的年龄是" + age);
        }

    }

}
