package study6;
/*
 * 自定义异常-小于0时触发
 */

public class LessThanException  extends Exception{

    //重写两个父类的异常就行了
    private int value;

    public LessThanException(){
        super("数字不能小于零");
    }

    public LessThanException(int value){
        super("输入的数字为：" + value +",不能小于零！");
    }

}
