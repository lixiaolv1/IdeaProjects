public class StringDemo {
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

    }
}
