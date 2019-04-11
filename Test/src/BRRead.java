import java.io.*;
import java.util.Scanner;

public class BRRead {
    public static void main(String args[]) throws IOException {
        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String br = new Scanner(System.in).next();
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
//            c = br;
//            System.out.println(c);
        } while (c != 'q');
    }
}