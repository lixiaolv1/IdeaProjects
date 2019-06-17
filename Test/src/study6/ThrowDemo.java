package study6;
/*
 * 演示手动抛出异常
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Hero hero = new Hero("貂蝉");
        try {
            hero.setExp(1000);//此处是必检异常，所以必须要tey-catch
            hero.setHealth(40);
            hero.rideHorse();
        } catch (Exception e) {
            e.printStackTrace();
          //  System.err.println("在设置经验值时出现异常：" + e.getMessage());
        }
        System.out.println("当前英雄的经验值" + hero.getExp());

    }

}

class Hero{
    private String name;
    private long exp;
    private int health;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    /*
     * 英雄的骑马方法-当英雄的健康值低于50，不允许骑马
     */
    public void rideHorse() throws LessThanException{
        if (health >= 50) {
            System.out.println(name + "正在快乐的骑马！");
        }else{
            throw new LessThanException(health);
        }

    }

    public Hero(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getExp() {
        return exp;
    }

    public void setExp(long exp) throws Exception {
        if (exp >= 0 ) {
            this.exp = exp;
        }else{//当exp为负数时候，强制抛出异常
            throw new Exception("经验值不能为负数！");
            //此处报错时因为只抛出异常，但是没有进行处理
            //谁调用水处理，让setExp处理抛出异常
        }

    }


}
