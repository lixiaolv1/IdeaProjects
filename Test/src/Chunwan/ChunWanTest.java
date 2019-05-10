package Chunwan;

import javax.management.InstanceNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ChunWanTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Director 张艺谋 = new Director();

        Singer 宋祖英 = new Singer("宋祖英");
        Dancer 杨丽萍 = new Dancer("杨丽萍");
        //  因为Actor类加了abstract变成了抽象类，无法使用new来实例化
        //Actor actor = new Actor("周立波");
        张艺谋.action(宋祖英);
        张艺谋.action(杨丽萍);

        //1.模拟程序的升级，要求添加相声演员，核心业务层代码不变
        CrossActor 冯巩 = new CrossActor("冯巩");
        张艺谋.action(冯巩);

        //2.要求main方法也不像修改的情况下，实现某个的升级
        //解决方案：使用反射+ 多态技术实现无缝升级
        Properties props = new Properties();//对应Java配置文件
        //读取配置文件中的内容
        props.load(ChunWanTest.class.getResourceAsStream("ActorConfig.properties"));
//		//通过反射实例化配置文件中配置的类
        //配置文件末尾不要加“；”不要加分号，浪费时间
        Actor actor = (Actor)Class.forName(props.getProperty("crossactor")).newInstance();
        actor.setName("郭德纲");
        张艺谋.action(actor);

    }
}
