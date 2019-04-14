import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //字符串的不可变性
        //演示常用的几种String对象的构建方式
        String str1 = "你好世界！";
        String  str2 = new String();//this.value = "".value  此方法是新建一个空间然后将空字符串赋值给新的空间
        String str3 = new String(str1);//this.value = original.value;this.hash = original.hash; 将值和hash值同事赋给新对象空间
        System.out.println(str1 == str3);//但他们不相等

        char[] chArray = {'a','b','c'};//在C中，字符数组和字符串的区别就在于最后一个元素是否是\0
        //将字符数组转换成数组
        String str4 = new String(chArray);
        //当然也可以将字符串转回字符数组
        chArray = str4.toCharArray();
        System.out.println(str4);

        //字节数组和字符串的转换 byte数据类型：-128到127之间
        byte[] byteArray = {104,101,108,108,111};
        String str5 = new String(byteArray);
        System.out.println("转义结果为" + str5);

        //字符串转码
        String str6 = new String(str1.getBytes(),"UTF-8");
        System.out.println(str6);

        //trim方法：去掉字符串左右两侧的空格—比如登录选项，两边看不清，建议是用户输入用户名后使用
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String uName = input.nextLine().trim();
//        String uName = input.next().trim();
        System.out.println("--" + uName + "--");//如果输入  a b c d ，打印则只会出现--a--
        //是因为next()方法只能读到空格或回车,使用nextLine()则可以

        //字符串比较
        System.out.println("abc".equals("abc")); //结果为true
        System.out.println("abc".compareTo("abc")); //比较Asci码，大于0或者等于0或者小于0，使用compareToIgnoreCase()则忽略的大小写比较
        System.out.println("abc".startsWith("ab"));//是否以ab开头，是返回true
        System.out.println("abc".endsWith("bc"));//同上，看结束字符
        System.out.println("abcdefg".contains("cd")); //是否包含此字符串，返回true

        //获取子串的方法
        Scanner input1 = new Scanner(System.in);
        String password = "123456abcdefg";
        System.out.println(password.indexOf("cd",2));//获取该字符的位置，从0开始，和JS一样，找不到就返回-1
        //此处的参数  2 ，是从第几位开始计算



        String value = "德玛西亚之力";
        //String到底是什么？  实际上是char型数组的包装类
        //private final char value[];因为String类型赋值后，直接是final类型的数组
        //但是看起来String是可以操作的，比如呢
        value += "—盖伦";
        System.out.println(value);
        //因为 “+=” 实际上是concat方法，如
        value = value.concat("盖伦");
        //无法直接使用value.concat()，因为concat此方法最终的输出是new一个新String，不改变原来的对象
        //concat是非常消耗内存的，是两个内存条拼接，然后输出第三个
        //此次更新能否更新线上版本----已成功，是2019-4-12 11:14上传更新成功
        //此次看线上版本如何更新到线下----成功，此次成功在2019-4-12 11.20下载更新成功
        //只要右键项目—pull一下就可以了
        //修复idea push提交每次everything的问题
        //是否每次需要右键项目add--然后再push---不正确，还是会提示everything
        //不管了，每次麻烦点儿就是了----要不再试试？——md，果然还是不行，只能通过命令提交
        //4-12在家提交---失败，尝试使用命令提交吧--原来要关闭代码检查-右键项目里面的commit里的perform code
        //参考最后步骤，直接成功--有小毛病，为什么呢，是因为没有写更新备注吗-为什么啊
        //难道是文件和日志必须要同时更新？？？
        //4-13 00:33临睡前更新，慢慢来吧
        //aaaaa,还特么老代码覆盖了新代码
    }
}

