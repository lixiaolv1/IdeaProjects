package study6;
/*
 * 计算两个字符串数字的除法（需要类型转换）
 */


public class DivisionException {
    public static void divsion(String strNum1, String strNum2) throws ArithmeticException,NumberFormatException{
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 /num2;
    }

    public static void main(String[] args){
        try {
            //谁调用，谁处理
            divsion("123","abc");
        } catch (ArithmeticException | NumberFormatException e) {
            //ArithmeticException,NumberFormatException   这两个异常是免检异常
            e.printStackTrace();
        }
        System.out.println("程序结束");//此处使用的是throws,在异常报错时程序已经结束，无法执行到此句
        //此处应该用try-catch，保证至少有一个地方进行了异常处理
    }
}
