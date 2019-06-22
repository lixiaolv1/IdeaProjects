package study6;
/*
 * 演示文件输入流、输出流的基本用法\
 * 注意：目前的读、写文件方式都比较原始，在这里熟悉常用的InputStream和OutputStream的一些重用方法即可、
 * 后续会有一个高级的类对读写方法进行升级和扩展
 */

import java.io.*;
import java.util.Scanner;

public class FileStream {
    private static final String FilePath = "Test/src/study6/test.txt";
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        /*
         * System.in 默认方法就是 InputStream in = null;
         * System.out默认方法就是 PrintStream out = null;
         *
         */
        // ReadFile();
        WriteFile();
    }

    public static void WriteFile() throws IOException {
        final String FilePath1 = "Test/src/study6/FileDemo1.java";   //注意：默认此文件不存在
        OutputStream outputStream = new FileOutputStream(FilePath1,false);//第二个参数：是否追加写入
        String content = "package study6;\n public class FileDemo1 {\n ";
        content += "public static void main(String args){\n";
        content += "System.out.println(\" Hello World \");\n}\n}";
        outputStream.write(content.getBytes()); //核心语句：将字符串转换成字符数组，写入到文件中
        //写入完毕后一定记得关闭打开的资源
        outputStream.close();
    }


    public static void ReadFile() throws IOException {
        /*
         * FileInputStream inputStream = new FileInputStream(file);
         * 直接实例化FileInputStream也是可以的，这是为了讨论 InputStream和FileInputStream 的父子关系，才使用多态
         */
        File file = new File(FilePath); //省略判断
        InputStream inputStream = new FileInputStream(file);//进行必检异常处理，避免文件找不到
        //inputStream.available()   获取输入流可以读取的文件大小（字节）
        //读取文件的基本操作—相对比较固定
        byte[] bytes = new byte[5000];
        //为什么读取出来的文件结尾有问号,是byte设定长度过长，但是设定成72后会报错
        //设定值小于文件长度就会报错，过大就会无反应
        inputStream.read(bytes);//将read（）方法读取的内容添加到 bytes[]

//        int count = 0;
//        while ( (bytes[count] = (byte) inputStream.read() ) != -1){
//            count ++ ;
//        }//最原始的方法，内部也是这种循环读取，并且方法还进行了判断和优化
        String content = new String(bytes); //将读取出的字节数组转换成字符串，以便打印
        System.out.println(content);
        inputStream.close();
    }

}
