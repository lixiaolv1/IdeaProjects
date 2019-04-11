
import java.util.Date;
import javax.swing.*;

public class APPMain {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        String[] names = {"西施","貂蝉","王昭君","赵飞燕","杨玉环","","","","",""};
        //野生美女的姓名数组
        String[] newNameArray = {"褒姒","陈圆圆","苏小小","钟无艳","甄嬛"};
        int newNameCount = newNameArray.length;
        //待选美女的总数

        //级别数组，最多容纳5个字符串
        String[] levelNames = {"贵人","嫔妃","贵妃","皇贵妃","皇后"};
        //用来存放每个妃子的等级，与levelNames联用，-1标识未启用
        int[] level = new int[10];
        //用来存放每个妃子好感度，-1标识未启用
        int[] loves = new int[10];
        int nncount = 5;
        int gamedays = 1;

        for (int i = 0; i < nncount; i++) {
            loves[i] = 100;
        }
     //   Class.class.getResource("").getPath();//使用此方法来获取路径，再后面配置使用
        //游戏主界面，
        JOptionPane.showMessageDialog(null,"陛下您来了！","欢迎来到后宫选妃",0,new ImageIcon("" + "Test/images/1.jpg"));

        while(gamedays <= 10) {
//            System.out.println("游戏进行到第" + gamedays + "天");
//            System.out.println("1、皇帝下旨选妃\t\t(增加)");
//            System.out.println("2、翻牌宠幸\t\t(修改状态）");
//            System.out.println("3、打入冷宫\t\t(删除)");
//            System.out.println("4、朕的爱妃呢\t\t(查找、修改状态)");
//            System.out.println("陛下请选择：");
            String StrMenu = "1、皇帝下旨选妃\n";
                StrMenu += "2、翻牌宠幸\n";
                StrMenu += "3、打入冷宫\n";
                StrMenu += "4、朕的爱妃呢\n";
                StrMenu += "陛下请选择";

           //showInuptDialog，下拉选择框
           Object objResult = JOptionPane.showInputDialog(null,StrMenu,"游戏进行到第" + gamedays + "天",0,
                   new ImageIcon("Test/images/1.jpg"),new String[]{"1","2","3","4"},4);
           //应该判断
//            int choice = input.nextInt();

            switch(objResult.toString()) {
                case "1":		//选妃，增加
                    if(nncount == names.length) {
                        System.out.println("抱歉，后宫已经人满为患了");
                        break;
                    }
//                    System.out.println("请输入新晋娘娘的名讳：");
//                    String newName = input.next();
                 objResult = (String)JOptionPane.showInputDialog(null,"请选择秀女","新增嫔妃",0,
                        new ImageIcon("Test/images/2.jpg"),newNameArray,null);


                    if(objResult == null){  //用户选择了取消
                        continue;//自行测试一下continue和break的区别
                    }
                    JOptionPane.showMessageDialog(null,objResult.toString(),"选中的嫔妃",0,
                            new ImageIcon("Test/images/"+objResult.toString()+".jpg"));
                    //增加：姓名数组、好感度数组、级别数组
                    names[nncount] = objResult.toString();
                    loves[nncount] = 100;//后置++，先执行完names[nncount ++] = newName，再执行++
                    //其他娘娘好感度-10
                    for (int i = 0; i < nncount; i++) {
                        loves[i] -= 10;
                    }
                    nncount ++;
                    break;
                case "2"://翻牌宠幸 选中+20，其余人-10
//                    System.out.println("请输入娘娘的名讳：");
//                    String name = input.next();
                   objResult = JOptionPane.showInputDialog(null,"陛下请选择","翻牌",0,
                            new ImageIcon("Test/images/7.jpg"),
                            names,
                           null
                    );

                   if(objResult == null){
                       continue;
                   }
                    //查找
                    int searchIndex = Integer.MIN_VALUE;
                    for (int i = 0; i < nncount; i++) {
                        if (objResult.toString().compareTo(names[i]) == 0) {//姓名相等的情况
                            searchIndex = i;
                            break;
                        }
                    }
                        if(searchIndex == Integer.MIN_VALUE) {
                            System.out.println("陛下，不要活在梦中");
                            break;
                        }
                        //找到的情况：当前好感度+20并升1级，其他人好感度-10
                        loves[searchIndex] += 20;
                        if(level[searchIndex]+1 == levelNames.length) {
                            System.out.println(names[searchIndex] + "娘娘已经母仪天下");
                            loves[searchIndex] += 10;
                        }else {
                            level[searchIndex] ++;
                            for (int i = 0; i < nncount; i++) {
                                if(i == searchIndex){
                                    continue;
                                }
                                loves[i] -= 10;
                            }
                        }

//              System.out.println("宠幸" + names[searchIndex] + ",好感度+10，升级为" + levelNames[level[searchIndex]]+ "，其他娘娘好感度-10");
                JOptionPane.showMessageDialog(null,"宠幸" + names[searchIndex] + ",好感度+10，升级为" + levelNames[level[searchIndex]]+ "，其他娘娘好感度-10",
                            "翻牌的结果",0,new ImageIcon("images/"+names[searchIndex]+".jpg"));
                        break;

                case "3":

                    break;
                case "4":

                    break;

                default:
                    System.out.println("必须输入1-4之间的整数");
                    continue;
            }

//            System.out.println("姓名\t级别\t好感度");
//            for (int i = 0; i < nncount; i++) {
//                System.out.println(names[i] + "\t" + levelNames[level[i]] + "\t" + loves[i]);
//            }

            //如果后宫有4个以上的妃子好感度都低于60，那么发生暴乱，游戏强制退出
            int count1 = 0;
            for (int i = 0; i < nncount; i++) {
                if (loves[i] < 60) {
                    count1 ++;
                }
            }

            String reslutValue = "后宫有3个以上的娘娘好感度低于60，暴动！\n";
            reslutValue += new Date().toLocaleString();
            if (count1 > 3 ){
                JOptionPane.showMessageDialog(null,reslutValue,"混沌",0,
                        new ImageIcon("images/24.jpg"));
                System.exit(0);
            }

            //每日结算
            String value = "又度过了没羞没臊的一天\n";
            for (int i = 0; i < nncount ; i++) {
                //     System.out.println(names[i] + "\t" + levelNames[level[i]] + "\t" + loves[i]);
                value += String.format("%s   %s    %d\n",names[i],levelNames[level[i]],loves[i]);
            }
            JOptionPane.showMessageDialog(null,value,"每日结算",0,
                    new ImageIcon("images/5.jpg")
            );

            gamedays ++;
        }
    }

}
