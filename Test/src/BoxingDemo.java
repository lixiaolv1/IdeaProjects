public class BoxingDemo {
    public static void main(String[] args) {
        //高级Java版本其实是支持自动装箱和自动拆箱的，但是会浪费一定的效率和内存，所以为了更加节省
        //所以直接在定义属性和变量的时候，就把基本类型定义成包装类型

        //补充下字符包装类:Character  Integer
        
//        double num1 = 3.14;
//        //如何做成一个包装类
//        Double dNum1 = new Double("3.14");
//        Double dNum1_1 = Double.valueOf(dNum1);     //两种装箱的方法
//        Double dNum1_2 = 3.14;     //自动装箱
//
//        num1 = dNum1;  //自动拆箱
//        num1 = dNum1.doubleValue();
//
//        System.out.println(num1 + "\t" + dNum1);
        //实际上用起来也是一样的

        Integer num1 = 100;
        Integer num2 = 100;
        System.out.println(num1 == num2);
    }
}
