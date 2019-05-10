package StaticDemo;

public class StaticDemoTest {
    public static void main(String[] args) {
        StaticDemo staticDemo1 = StaticDemo.getInstance();
        System.out.println(staticDemo1.normal_number);

        StaticDemo staticDemo2 = StaticDemo.getInstance();
        staticDemo2.normal_number = 1024 ;

        StaticDemo staticDemo3 = StaticDemo.getInstance();
        System.out.println(staticDemo3.normal_number);
        /*
         * 为什么输出的是1024？
         * 因为在单例模式下，stticDemo1 和 staticDemo2 staicDemo3 指向的都是同一个对象
         */

        System.out.println(staticDemo1 == staticDemo2);

    }

}
