package study6;
/*
 * 演示File类的常用方法
 */

import java.io.File;

public class FileDemo {

    //当前要操作的文件路劲常量
    private static final String FilePath = "src/study6/FileDemo.java";
    public static void main(String[] args) {
        //new File(".");点就表示当前根目录文件
        File file = new File("FilePath");
        System.out.println("文件/文件夹是否存在:" + file.exists());
        System.out.println("是不是一个文件：" + file.isFile());
        System.out.println("是不是一个文件夹：" +file.isDirectory());
        System.out.println("文件/目录名：" + file.getName());
        System.out.println("文件的绝对路径是" + file.getAbsolutePath());
        System.out.println("路径：" + file.getPath());


    }


}
