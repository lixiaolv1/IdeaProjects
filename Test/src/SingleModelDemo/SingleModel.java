package SingleModelDemo;
/*
 * 单例模式
 */

//此处加不加abstract都一样，因为构造方法为private，外部都无法new实例化
public class SingleModel {
    /*      用来保存唯一的本类的实例    */
    private static SingleModel me = null;
    public int count = 0;
    private SingleModel(){
        count ++ ;
    }
    //获得本类唯一的一个实例 -- 单例模式的核心方法
    //为什么本方法实例化后，主类加abstract会报错呢？
    //是因为主类上abstract 优先级比public里的实例化优先级高吗？
    public static SingleModel getInstance(){
        if (null == me ) {
            me = new SingleModel();
        }
            return me;

    }

}
