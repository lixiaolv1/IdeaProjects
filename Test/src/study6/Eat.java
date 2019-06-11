package study6;
/*
 * 吃接口
 */

public interface Eat {
    public String name = "接口中定义的数据域";
    //不需要写publc

    /*
     * public static void test();
     * 很明显是不可以的
     * 接口里面不能定义静态的方法，接口里的东西一定是子类去实现的，而静态的已经实现了
     * 所以每次定义一个方法，实际上是 public abstract String test()
     */

    default public void eating(){
        System.out.println("Eat接口的默认实现");
    }

}

interface Eat1{
    default public void eating(){
        System.out.println("Eat接口的默认实现1");
    }
}