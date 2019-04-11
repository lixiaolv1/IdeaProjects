public class RoleTest {
    public static void main(String[] args) {
        //实例化
        //这个地方就是典型的方法重载
        Role role1 = new Role("大娃",36,"力大无穷");
//        System.out.println(role1);
        role1.name = "劳拉";
        role1.doSkill();

        Role role2; //声明了Role类型的变量，变量名为role2
//        role2 = new Role();//   role2.job = "神仙"，如果直接使用，不行，必须要先实例化，直接使用没有空间不可以。

    }
}
