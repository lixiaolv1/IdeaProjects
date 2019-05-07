package User;

public class StringUtil {
    private static String value;
    /*
     判断用户输入的用户名是否是合法的用户名
     */

//1、用户名最多25个字符长度，不能包含空格，单双引号，问号等特殊符号
    public boolean isCorrectUserName(String userName){
        boolean isCorrect = true;
        String sql = "select * from users where id='%s' and password='' or '1'='1'";
        //sql的注入漏洞，用拼接字符串的方式攻击后台系统
        if(userName == null) return false;
        if (userName.length() > 25)return false;
        char[] unValidChar = {' ', '\'', '"','?','!','<','>',','};
        for(char ch : unValidChar){
            if(userName.contains(Character.toString(ch))){
                isCorrect = false;
                break;
            }
        }
        return isCorrect;
    }
//2、密码6-18位，只能包含字母，数字，特殊符号（下划线，@，#，!)
    //纯数字，纯字母，密码强度都是弱  两颗星
    //数字+密码，数字+符号，数字+字母，强度为中  四颗星
    //同时存在三种字符，强度为强  六颗星

    //如果返回值为“”，那么密码的验证失败，验证成功，则返回星号强度
    public static String ValidatePassword(String password){
        String power = "";//密码的强度
        if (power == null) return power;
        if (password.length() < 6 || password.length() > 18) return power;
        //密码中合法的组成部分
       // String[] correctPart = {"_","@","!","$","#"};
        String part = "_@#$!";
        for (int i = 0; i < password.length(); i++) {
            //此段后面理解
            if (!Character.isLetterOrDigit(password.charAt(i))){
                //如果不是字母或数字，也不是合法的特殊符号，就证明是非法的格式
                //搞鸡毛，一个非符号，浪费我一个小时时间，干
                if (!part.contains(Character.toString(password.charAt(i)))){
                    return power;
                }
            }
        }
        //下面开始判断密码的长度
        if(isDigit(password) || isLetter(password)){
            power = "★★☆☆☆☆";
            System.out.println("成功1");
        }else if(isDigitAndLetter(password)){
            power = "★★★★☆☆";
            System.out.println("成功2");
        }else if(isContainsSymble(password)){
            power = "★★★★★★";
            System.out.println("成功3");
        }

        return power;
  }

  // 是否包含数字，字母，特殊符号----为什么这个方法要加static才能用----因为静态方法是不能调用自己的静态方法
//    private static boolean isDigitAndLetterAndSymble(String value){
//        for (int i = 0; i < value.length(); i++) {
//            if (!(Character.isDigit(value.charAt(i)) ||
//                    Character.isLetter(value.charAt(i)) ||
//                    "_@$!".contains(Character.toString(value.charAt(i))))){
//                return false;
//            }
//        }
//        return true;
//    }


    //字符串中包含合法的字母和数字
    private static boolean isDigitAndLetter(String value){
        for (int i = 0; i < value.length(); i++) {
            if(!Character.isLetterOrDigit(value.charAt(i))){
                return false;
            }
        }
        return true;
    }

    //判断一个字符串是不是纯数字
    private static boolean isDigit(String value){
        for (int i = 0; i < value.length(); i++) {
            if(!Character.isDigit(value.charAt(i))){
                return false;
            }
        }
        return true;
    }

    //判断换一个字符串是不是纯字母组成的
    private static boolean isLetter(String value){
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isLetter(value.charAt(i))){
                return false;
            }
        }
        return true;
    }
    //判断一个字符串中是否有特殊字符
    private static boolean isContainsSymble(String value){
        String part = "_@#$!";
        for (int i = 0; i < value.length(); i++) {
            if(part.contains(Character.toString(value.charAt(i)))){
                return true;
            }
        }
        return false;
    }

}
