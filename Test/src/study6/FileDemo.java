package study6;

import java.io.File;

public class FileDemo {

    //使用常量来定义路径方便修改
    //切记删除文件的时候慎用，刚才就踏马把这个java文件删了
    private static final String FilePath = "Test/src/study6/FileDemo.java";
    //在Windows平台下，路径可以写作 “Test\\src\\study6\\FileDemo.java”,但是不建议这么做

    public static void main(String[] args) {
        //“.”路径表示当前工程根目录
        File file = new File(FilePath);

        System.out.println("文件/文件夹是否存在： " + file.exists());
        System.out.println("是不是一个文件： " + file.isFile());
        System.out.println("是不是一个文件夹： " + file.isDirectory());
        System.out.println("文件名/目录名： " + file.getName());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("路径： " + file.getPath());


    }


}
