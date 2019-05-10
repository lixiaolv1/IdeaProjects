package StaticDemo;

/*
 * 使用静态关键字实现了单例模式：只能获得某个类的唯一一个实例
 */

public class StaticDemo {
    //private StaticDemo me = this ;//此处写成私有，只允许实例化一次
    private static StaticDemo me = null ;

    /*
     * 将构造方法私有，以便外部无法使用new进行实例化的效果
     */
    private StaticDemo(){
        //将构造方法定义为私有的
        me = this ;
    }

    /*
     * 要获得当前类对象的实例，只能调用本方法
     */
    public static StaticDemo getInstance(){
        if (me == null) {
            me = new StaticDemo();//唯一的一次实例化
        }
        return me;
    }

    //此处的static并不是控制访问权限的修饰符，这个静态指的是方法和属性的生命周期
    //静态属性和方法是实例化之前就已经存在了，直到程序结束后才消失
    public static int static_number = 1;
    //类属性，即一个类只有一个属性

    public int normal_number = 1 ;
    //成员属性

    public void test(){
        static_number ++;
        normal_number ++;
    }

    public static void test1(){
        static_number ++;
       // normal_number ++;  静态方法中只能调用静态方法和静态属性
    }

//    public static void main(String[] args) {
//        StaticDemo staticDemo = new StaticDemo();
//        staticDemo.test();
//
//        System.out.println(staticDemo.static_number);
//        System.out.println(staticDemo.normal_number);
//
//        StaticDemo staticDemo1 = new StaticDemo();
//        staticDemo1.test();
//
//        System.out.println(StaticDemo.static_number);//所以对比下面，使用类名来访问
//       // System.out.println(staticDemo1.static_number);
//
//        System.out.println(staticDemo1.normal_number);
//        staticDemo1.test();
//        staticDemo1.test();
//
//        System.out.println(StaticDemo.static_number);
//   }

}
