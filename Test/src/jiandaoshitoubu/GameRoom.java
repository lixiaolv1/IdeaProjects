package jiandaoshitoubu;

import java.util.Scanner;

public class GameRoom {
    //属性：记分牌，道具，参与游戏的玩家，房间号，房间名称，房间的密码
    private HumanPlayer player1 = null;
    private ComPlayer player2 = null;
    private int roomId;
    //房间名称
    private String roomName;
    //房间密码
    private String roomPass;

    //游戏进行的步骤
    public GameRoom(String roomName,String roomPass){
        if (!("游戏盒子".equals(roomName) && "12345".equals(roomPass))){
            System.out.println("密码错误，退出");
            return;
        }
        this.setRoomName(roomName);
        initGame();
        startGame();
        endGame();
    }

    //方法：开始游戏，初始化游戏，显示菜单，选择人物，判断输赢（可以定义在裁判类中）
    //初始化游戏
    public void initGame(){
        //1.实例化游戏玩家对象
        player1 = new HumanPlayer();
        player2 = new ComPlayer();
        //2、初始化游戏的其他属性
        //如：游戏中的花花草草等
        for (int i = 0; i < 20 ; i++) {
            System.out.print("*");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n游戏加载成功");
    }

    public void startGame(){
        showMenu();
        choiceRole();
        //接下来就是游戏了，双方出拳
        Gaming();
        //然后打印结果
    }

    private void Gaming() {
        while (true) {
            System.out.println(player1.getName() + "请出拳：");
            Scanner input = new Scanner(System.in);
            //省略判断
            player1.setFirst(input.nextInt());
            int fist1 = player1.getFirst();
            player2.getFirst();
            int fist2 = player2.getFirst();
            //判断输赢
            int result = judge(fist1, fist2);
            //如果返回-1，玩家1胜利，如果是0，平局，返回1，玩家2胜利
            if (result == -1) {
                System.out.println("【吉老师】:" + player1.getName() + "胜利");
                player1.sendMessage(HumanPlayer.MessageTypeWin);
                player2.sendMessage(HumanPlayer.MessageTypeLose);
            } else if (result == 0) {
                System.out.println("【吉老师】:" + "双方打平");
                player1.sendMessage(HumanPlayer.MessageTypeFirst);
                player2.sendMessage(HumanPlayer.MessageTypeFirst);
            } else {
                System.out.println("【吉老师】:" + player2.getName() + "胜利");
                player1.sendMessage(HumanPlayer.MessageTypeLose);
                player2.sendMessage(HumanPlayer.MessageTypeWin);
            }
            System.out.println("是否要继续游戏？");
            String answer = new Scanner(System.in).next();
            if (!"y".equalsIgnoreCase(answer)) {
                break;
            }
        }
    }

    public void showMenu(){
        System.out.println("欢迎进入游戏《" + roomName + "》游戏房间");
        System.out.println("出拳规则：1—剪刀，2—布，3—石头");
    }

    public void choiceRole(){
        System.out.println("对方角色：1—风间，2-妮妮，3-正南，4-阿呆");
        System.out.println("请选择：");
        int choice = new Scanner(System.in).nextInt();
        String[] nameArray = {"风间","妮妮","正南","阿呆"};
        //此处省略对用户输入的验证
        player2.setName(nameArray[choice - 1]);
        player1.setName("原野新之助");
        System.out.println(player1.getName() + "  VS  " + player2.getName());
    }

    public int judge(int fist1,int fist2){
        if(fist1 == fist2) return 0;//平局
        if (fist1 == 1 && fist2 == 3 || fist2 == 2 && fist2 == 1 || fist1 == 3 && fist2 == 2){
            //玩家1的分数+1，玩家2的分数-1
            player1.setScore(player1.getScore() + 1);
            player2.setScore(player2.getScore() - 1);
            return -1;//玩家1胜利
        }
            player1.setScore(player1.getScore() - 1);
            player2.setScore(player2.getScore() + 1);
            return 1;//玩家2胜利
    }

    public void endGame(){
        System.out.println(player1.getName() + "\t" + player2.getName());
        System.out.println(player1.getScore() + "\t\t" + player2.getScore());
        System.out.println("游戏结束，欢迎下次再来");
    }

    //
    public long getRoomId(){
        return roomId;
    }
    public void setRoomId(int roomId){
        this.roomId = roomId;
    }
    public String getRoomName(){
        return roomName;
    }
    public void setRoomName(String roomName){
        this.roomName = roomName;
    }
    public String getRoomPass(){
        return roomPass;
    }
    public void setRoomPass(String roomPass){
        this.roomPass = roomPass;
    }
}
