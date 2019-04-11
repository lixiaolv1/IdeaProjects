import javax.swing.*;

public class DialogDemo {
    public static void  main(String[] args){
        //参数1、对话框的父窗体对象
//        JOptionPane.showMessageDialog(null,"提示信息");
        //参数2、对话框中的提示信息
        //参数3、对话框的标题信息
        //参数4、对话框中的消息类型
//        JOptionPane.showMessageDialog(null,"今天你吃了吗?","嘘寒问暖",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"成都欢迎你!","Hello",JOptionPane.WARNING_MESSAGE,new ImageIcon( "images/1.jpg"));

      //  JOptionPane.showInputDialog(null,"吃了吗","标题",0,new ImageIcon("images/1.jpg"),null,"默认值");

//        JOptionPane.showInputDialog(null,"吃了吗","标题",0,new ImageIcon("images/1.jpg"),
  //              new String[]{"1、吃了","2、没吃","3、谢谢你啊"},
    //            "默认值");

        JOptionPane.showConfirmDialog(null,"到底去不去吃？");
    }

}
