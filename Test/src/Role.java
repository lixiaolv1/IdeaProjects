    /*
     *游戏的角色类
     */
public class Role {
    //名称:劳拉
    //等级：25，职业考古学家，技能，双枪
        //游戏角色的名称属性
        public String name;

        //游戏角色的等级属性
        public int level;

        //游戏角色的职业属性
        public String job;

        //游戏技能
        public void doSkill(){
            if (name.equals("劳拉")){
                System.out.println("圣枪洗礼");
            }else if (name.equals("孙悟空")){
                System.out.println("当头一棒");
            }
        }

        /*
         *构造方法/构造器
         * 1、没有返回值
         * 2、方法名和类名一致
         * 符合这两点的就是构造方法
         */
        public Role(String name1,int level1, String job1){
                 name = name1;
                 level = level1;
                 job = job1;
        }
        /*
         * 其实如果不写构造方法，是有默认构造方法的
         * public Role(){}
         * 最推荐的是默认构造，再添加一个带参构造
         */

}
