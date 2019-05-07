public class StringBufferDemo {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "b";
        //String str3 = str1 + str2;
        //底层实现方式：
        String str3 = new StringBuffer(String.valueOf(str1)).append(str2).toString();//buffer意思就是待缓冲的字符串

        //如果拼接字符串的操作很多的话，那么使用+号的效率是非常低的
        final int N = 100000;
//        long startTime = System.currentTimeMillis();
//        String str = "*";
//        for (int i = 0; i < N; i++) {//十万次循环，拼接用时
//            str += "*";
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("+=用时：" + (endTime - startTime) + "毫秒");
//
//        //接下来使用stringBuffer进行拼接
//        startTime = System.currentTimeMillis();
//        StringBuffer str5 = new StringBuffer("*");
//        for (int i = 0; i < N; i++) {//十万次循环，拼接用时
//           str5.append("*");
//        }
//        endTime = System.currentTimeMillis();
//        System.out.println("stringBuffer的append用时：" + (endTime - startTime) + "毫秒");

        //StringBuffer的加强版，StringBuilder,但本质上是一个东西

        StringBuffer strBuffer = new StringBuffer("你好，成都！");
        StringBuffer strBuffer1 = new StringBuffer("你好，成都！");
        StringBuffer strBuffer2 = new StringBuffer("你好，成都！");

        System.out.println(strBuffer.equals(strBuffer1));//等于false,因为比的是地址，new当然不会相等了
        //StringBuffer大概相当于sql的增删改查，所以得将它转成String比较，这样就相等了
        System.out.println(strBuffer.toString().equals(strBuffer1.toString()));

        System.out.println(strBuffer.reverse());//反转
        System.out.println(strBuffer1.insert(3,"aaa"));//在规定的下标处插入别的元素
        System.out.println(strBuffer2.deleteCharAt(3));     //删除指定位置的元素
        System.out.println(strBuffer.delete(2,4));      //删除指定区间的元素，左闭右开区间，删除[2,4) 的元素
        System.out.println(strBuffer.replace(2,4,"内容"));  //替换指定段的内容
        strBuffer.setCharAt(3,'武');  //单独设置某一个位置的内容
        System.out.println(strBuffer);

        System.out.println("缓存大小：" + strBuffer.capacity());//默认是22
        strBuffer.setLength(0); //相当于清空了字符串

        //字符串过长时占用的多余空间，清空，相当于24kb下载一次，25kb就得下载两次一样的
        strBuffer.trimToSize();

    }
}
