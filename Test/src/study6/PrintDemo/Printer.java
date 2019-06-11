package study6.PrintDemo;
/*
 * 打印机了——使用标准的墨盒和纸张
 */

import study6.PrintDemo.iface.IInkBox;
import study6.PrintDemo.iface.Ipaper;


public class Printer {
    private IInkBox inkBox = null ;//打印机的墨盒
    private Ipaper paper = null ;//打印机的纸张

    /*
     * 打印机的打印方法——使用墨盒和纸张
     * content 传递给打印机打印的字符串内容
     */
    public void print(String content){
        if (inkBox == null || paper == null){
            System.out.println("墨盒和纸张书写错误，请安装正确后重试");
            return;
        }
        //打印过程
        String color = inkBox.getcolor();
        String type  = paper.getSize();
        System.out.println("以下文字是" + color + "颜色的！");
        System.out.println("使用纸张：" + type);
        System.out.println("打印内容" + content);

    }

    public IInkBox getInkBox() {
        return inkBox;
    }

    public void setInkBox(IInkBox inkBox) {
        this.inkBox = inkBox;
    }

    public Ipaper getPaper() {
        return paper;
    }

    public void setPaper(Ipaper paper) {
        this.paper = paper;
    }
}
