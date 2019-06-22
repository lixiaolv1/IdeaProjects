package study6;

import javax.swing.*;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

public class FileDemo {

    //使用常量来定义路径方便修改
    //切记删除文件的时候慎用，刚才就踏马把这个java文件删了
    private static final String FilePath = "Test/src/study6";
    //在Windows平台下，路径可以写作 “Test\\src\\study6\\FileDemo.java”,但是不建议这么做

    public static void main(String[] args) throws IOException {
        //“.”路径表示当前工程根目录
        JFileChooser fileChooser = new JFileChooser(new File("."));

        //让fileChooser选择文件夹
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.setFileFilter(new MyFileFilter());
        fileChooser.showOpenDialog(null);   //显示选择文件的对话框(null表示无父窗体）
        File file = fileChooser.getSelectedFile();  //获得用户选择的文件
        //建议使用的时候判断file是否为null，如果为null，表示用户点了“取消”按钮
        if (null == file){
            System.out.println("用户未选择任何文件");
            System.exit(0);
        }

        System.out.println("文件/文件夹是否存在： " + file.exists());
        System.out.println("是不是一个文件： " + file.isFile());
        System.out.println("是不是一个文件夹： " + file.isDirectory());
        System.out.println("文件名/目录名： " + file.getName());
        System.out.println("绝对路径：" + file.getAbsolutePath());
        System.out.println("路径： " + file.getPath());
        System.out.println("最后修改时间：" + new Date(file.lastModified()).toLocaleString());
        System.out.println("是否隐藏" + file.isHidden());
        System.out.println("是否可读" + file.canRead());
        System.out.println("是否可写" + file.canWrite());
        System.out.println("所占空间" + file.length() + "B");
        //只能计算文件大小，文件夹大小需要计算——所有文件大小累加

        /*
         * file.canExecute()；文件是否可执行
         * 仅在Linux下有效，Windows无法执行
         */

        //使用File类创建文件
        if (!file.exists()) {//如果文件/目录不存在，就创建
            /*
             * 此处应该使用try-catch，这是为了方便阅读所以只抛出不处理
             */

            if (file.isFile()) {
                file.createNewFile();
                System.out.println("创建文件！");
            }
//            else if (file.isDirectory()) 无法判断这是一个文件夹，所以创建了一个未知类型的文件
            file.mkdir();//创建目录
            System.out.println("创建目录！");
            /*
             * mkdir()  创建此抽象路径名称指定的目录（及只能创建一级目录，且需要存在父目录）
             * mkdirs() 创建此抽象路径指定的目录，包括所有必须但不存在的父目录，（及可以创建多级目录，无论是否存在父目录）
             *           ——多级目录时候使用
             */

            if (file.createNewFile()) {
                System.out.println("创建文件/文件夹成功");
            }

        }

        //删除文件/文件夹
//        if (file.exists()){
//            file.delete();  //delete是立即删除
//            file.deleteOnExit();    //在程序/进程结束的时候删除
//            System.out.println("删除文件/文件夹成功");
//        }

        //列出当前目录下的所有文件/文件夹
        /*
         * file.listFiles();列出当前目录下的所有文件对象
         * file.list()；列出所有的文件名
         */
        if (file.isDirectory()){
            String[] fileNames = file.list(new DirFilter());
            System.out.println(file.getAbsolutePath() + "路径下的所有文件及文件夹：");
            for (int i = 0; i < fileNames.length; i++) {
                System.out.println(fileNames[i]);
            }//因为打开的是一个普通的文件，不是文件夹，所以此处数组为空

        }

    }

    static class MyFileFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File f){
            if (f.getName().endsWith("txt")){
                return true;
            }
            return false;
        }

        @Override
        public String getDescription() {
            return "*.*,* .txt*";
        }

    //直接过滤掉了所有文件，待会儿试一下全部文件
    }


    //补充：选学
    /*
     * 自定义的文件名过滤器，必须实现FilenameFilter接口
     */


  static  class DirFilter implements FilenameFilter{

        @Override
        public boolean accept(File dir, String name) {
            //假设我们要求只显示docx为后缀的文件，过滤掉其他后缀
            if (name.endsWith("txt") || name.endsWith("docx")) {
                return true;
            }
            return true;
        }
    }

}

