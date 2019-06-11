package study6.PKGame;
/*
 * 城堡类——城堡不是英雄
 */


public class Castle implements Assailable {
    private String name;
    private int x;
    private int y;
    private int maxHp;
    private int hp;
    private int attackRange;

    public Castle(String name, int x,int y,int attackRange){
        setName( name );
        setX( x );
        setY( y );
        setAttackRange( attackRange );
        setMaxHp( 100 );
        setHp( 100 );

    }

    public void PK(Assailable assa){
        if (canFightByDistance( assa ) && hp >0 && assa.getHp() > 0 ){
            fight( assa );
            System.out.println("城堡对" + assa.getName() + "攻击了一次");
        }else {
            System.out.println("由于攻击距离或其他原因，城堡攻击失败");
        }

        // 3、 在控制台打印对战后的结果（控制台程序专用）
        System.out.println("两位英雄的当前状态");
        System.out.println("昵称\thp\tx坐标\ty坐标");
        System.out.println(name + "\t" + hp + "\t" + x + "\t" + y );
        System.out.printf("%s\t%d\t%d\t%d",
                assa.getName(),assa.getHp(),assa.getX(),assa.getY());
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    //计算距离
    protected double getDistance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(Math.abs(x2 - x1) ,2 )+ Math.pow(Math.abs(y2 - y1), 2 ));
    }

    @Override
    public boolean canFightByDistance(Assailable assa) {
        //1、计算与另一个可攻击对象之间的距离
        //2、如果攻击距离合法，就进行攻击
        double distance = getDistance( getX(),getY(),assa.getX(),assa.getY() );
        /*
         *getx（）和getY（）是获取当前类Castle的坐标
         * assa.getX（）和assa。getY()是获取要被攻击对象的坐标，再传到私有方法getDistanc（）进行计算
         * 最终reture 比较distanc距离 和 当前对象的attackRange攻击范围就可以了
         */
        return distance <= attackRange;
    }

    @Override
    public void fight(Assailable assa) {
        //假设城堡的攻击力固定
        int attack = 15;
        assa.setHp( assa.getHp() - attack );
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }


}
