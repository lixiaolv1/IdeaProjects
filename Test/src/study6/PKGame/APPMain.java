package study6.PKGame;
/*
 * 用来模拟核心业务逻辑层的代码
 */

public class APPMain {

    public static void main(String[] args) {
        Hero hero1 = new Warrior( 1,"曹操" ,0 , 0);
        Castle castle = new Castle( "温莎古堡", 10, 10, 100 );
        Hero hero2 = new Warrior( 2,"刘备" ,50 , 20);
       // hero1.PK( castle );
       // hero1.PK( hero2 );
        castle.PK( hero1 );

        //6-12更新

    }
}
