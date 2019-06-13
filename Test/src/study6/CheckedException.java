package study6;
/*
 * 必检异常——除了RuntimeException和Error的其他类的子类
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) throws IOException {
        //此处如果不catch，就必须要throws IOException
        File file = new File("c:/test.txt");
        try {
            FileWriter writer = new FileWriter( file );//文件的写入器，用来将内容写入到文件

        }catch (IOException e){
            e.printStackTrace();
        }
        //强制进行异常检测

        //判断这个文件是否存在
        System.out.println(file.exists());

    }

}
