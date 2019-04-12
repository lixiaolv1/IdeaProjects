public class StringDemo11 {
    public static void main(String[] args) {
        //字符串的不可变性

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
    }
}

