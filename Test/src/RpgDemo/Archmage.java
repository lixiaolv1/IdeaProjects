package RpgDemo;

    /*
        法师类，如何实现继承
     */

public class Archmage extends Hero{
    public int getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }

    private int magicAttack;

    public void biubiubiu(){
        System.out.println("大法师" + getNickName() + "：正在搓火球！");
    }

    public Archmage(){
        setNickName("默认法师");
        setLevel(1);
        setMaxLife(100);
        setCurrLife(100);
        setMagicAttack(99);
    }

    public Archmage(String nickName){
        this();//
    }

}
