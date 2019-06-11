package study6.PrintDemo;

import study6.PrintDemo.impl.A4PaperImpl;
import study6.PrintDemo.impl.B5PaperImpl;
import study6.PrintDemo.impl.ColorInkBoxImpl;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer();

        //为打印机安装墨盒和纸张
        printer.setInkBox( new ColorInkBoxImpl() );
        printer.setPaper( new B5PaperImpl() );


        printer.print("测试内容");
    }

}
