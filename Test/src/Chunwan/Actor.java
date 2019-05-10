package Chunwan;/*
    演员父类
 */

//加了abstract之后，Actor类就成了抽象类
public abstract class Actor {//当一个类是抽象类的时候，就不能使用New来实例化了！——从某种意义，抽象类是一个天生的父类
    private String name;

    public Actor(){

    }

    public Actor(String name){
        setName(name);
    }

    /*
    *演员的表演方法
     */
    public void performs(){
        System.out.println("演员" + name + "正在表演精彩的节目");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
