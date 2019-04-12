public class StringDemoOne {
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
    }
}

