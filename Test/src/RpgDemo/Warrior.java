package RpgDemo;
/*
     继承了Hero类
 */
public class Warrior extends Hero {
    // 战士类的静态属性，每实例化一个新的展示对象，ID ++
    public static int ID = 1;

    //战士的特有属性：物理攻击
    private int physicalAttack;

    public Warrior(){
        super();//子类构造中，默认调用父类构造
        setNickName("战士战士" + ID );
        setLevel(3);
        setMaxLife(200);
        setCurrLife(200);
        setPhysicalAttack(1000);
        ID ++;
//        System.out.println("子类的默认构造方法");//实际情况中，先调用父类的构造方法，再调用子类的方法
    };

//    public Warrior(String nickName,int physicalAttack){
//        setNickName(nickName);
//        setPhysicalAttack(physicalAttack);
//    }//不需要带参构造了，反正this()也是调用自己的默认构造，防止ID多余累加

    /*重写父类的移动方法，
        重载只管参数不同，重写是方法签名一致
    */

    @Override    //注解：重写，会检查方法名是否拼写错误
    public void move() {
        System.out.println(getNickName() + "：移动基本靠腿！");
    }

    //重写Object的equals方法，只要英雄名和攻击力相等就相等了
    @Override
    public boolean equals(Object obj) {
        //如果传入的obj对象是Warrior类的实例
        if (!(obj instanceof Warrior)){
            return false;
        }
        Warrior newWarrior = (Warrior)obj;
        if (getNickName().equals(newWarrior.getNickName()) && getPhysicalAttack() == newWarrior.getPhysicalAttack()){
            return true;
        }
            return false;
    }

    @Override   //重写toString方法
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append(getLevel());
        str.append("\t");
        str.append(getNickName());
        str.append("\t");
        str.append(getMaxLife());
        str.append("\t");
        str.append(getCurrLife());
        str.append("\t");
        str.append(getPhysicalAttack());

        return str.toString();
    }

    //     如果方法写错了，那么调用的时候就会到父类去了，重写无效
//    public void movee(){
//        System.out.println(getNickName() + "：移动基本靠腿！");
//    }
    public int getPhysicalAttack() {
        return physicalAttack;
    }

    public void setPhysicalAttack(int physicalAttack) {
        this.physicalAttack = physicalAttack;
    }
}
