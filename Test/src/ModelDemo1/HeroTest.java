package ModelDemo1;

public class HeroTest {
    public static void main(String[] args) {
        //两个战士之间的对战
        Hero hero1 = new Warrior( 1,"盖伦",0,0 );
        Hero hero2 = new Warrior( 2,"貂蝉",500,50 );
 //       hero1.PK( hero2 );

        Hero hero3 = new Magical( 3,"曹操",500,5, 15 );
        hero3.PK( hero1 );
        hero1.PK( hero3 );



    }

}
