package ProductDemo;

import javax.swing.*;

//商品管理类
public class ProductBiz {
    public static void main(String[] args) {
        int[] counts = new int[3];
        double total = 0;  //最终要支付的总金额
        //改进方案，因为这些数据无法被存储，所以需要用【对象数组】将它们保存下来
        Product[] products = new Product[3];

        for (int i = 0; i < counts.length ; i++) {
            if (products[i] == null) {
                products[i] = new Product();  //对象数组中的元素在使用之前，一定要记得分配空间
            }
            //数组里面只保存了地址，需要用的时候该怎么办呢？如上
            //Product product = new Product();
            String name = JOptionPane.showInputDialog("请输入商品名称：");
            products[i].setName(name);
            //此处省略商品的具体描述description

            //接收用户输入的商品评价，要注意，返回值是字符串类型！！
            String strPrice = JOptionPane.showInputDialog("请输入商品的单价：");
            //此处需要将字符串类型转换为double类型，再进行赋值
            //转换之前，最好进行验证，这个方法无法将如文字字母转成double，否则会报错
            //如：Exception in thread "main" java.lang.NumberFormatException: For input string: "瑞雯"
            products[i].setPrice(Double.parseDouble(strPrice));

            String strCount = JOptionPane.showInputDialog("请输入要购买的商品数量");
            counts[i] = Integer.parseInt(strCount);

            //累加总金额
            total += products[i].getPrice() * counts[i];
        }
        System.out.println("购物结算");
        for (int i = 0; i < counts.length ; i++) {
            System.out.println("商品名：" + products[i].getName() + "\t" + products[i].getPrice());
        }
        System.out.println("商品总金额为：" + total);
    }

}
