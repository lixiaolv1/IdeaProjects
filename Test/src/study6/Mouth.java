package study6;

public class Mouth implements Eat,Eat1 {
    public static void main(String[] args) {
        Mouth mouth = new Mouth();
        mouth.eating();
    }

    @Override
    public void eating() {
        Eat.super.eating();
        /*
         * jdk-1.8以后的语法，标准写法就这样
         * 如果要用Eat1就书写 Eat1.super.eating();
         */
    }
}
