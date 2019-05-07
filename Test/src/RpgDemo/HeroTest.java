package RpgDemo;

public class HeroTest {

    public static void main(String[] args) {
       // Hero 韩信 = new Warrior();//这局代码实际上两个部分实现实现的
//        Hero 韩信;                //声明了一个Hero类型的变量，名称为  韩信
//        韩信 = new Warrior();     //在堆内存中分配了空间（同时调用子类构造方法初始化），将空间地址赋给了韩信这个变量
//
//        韩信.setNickName("韩信");
//        韩信.move();

//        Warrior 曹操1 = new Warrior("曹操",1500);
//        曹操1.setLevel(89);
//        Warrior 曹操2 = new Warrior("曹操",1500);
//        曹操2.setLevel(99);
//
//        System.out.println(曹操1.compareTo(曹操2));
//        System.out.println(曹操1 ==  曹操2);
//        System.out.println(曹操1.equals(曹操2));
//
//        System.out.println(曹操1);//当print打印的时候，自动调用toString方法

        Archmage 貂蝉 = new Archmage("貂蝉");
        System.out.println(貂蝉);
    }

}
