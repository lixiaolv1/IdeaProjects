package User;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //以下代码实现用户注册
//        System.out.println("请输入用户名：");
//        String userName = input.next();
        System.out.println("请输入密码：");
        String password = input.next();

        System.out.println(StringUtil.ValidatePassword(password));
//
//        String password = input.next();
//        System.out.println("请输入电子邮箱地址：");
//        String email = input.next();
    }

}
