package jiandaoshitoubu;

public class ComPlayer {
    //静态常量：出拳时的信息
    public static final int MessageTypeFirst = 1;

    //静态常量：赢得比赛的信息
    public static final int MessageTypeWin = 2;

    //静态常量：输掉比赛的信息
    public static final int MessageTypeLose = 3;


    //根据传入的消息类型，随机打印对应的类型
    // msgType 对应HumanPlayer类中定义的静态常量
    public void sendMessage(int msgType){
        int index =(int)(Math.random()*4);
        String message = null;
        switch (msgType){
            case MessageTypeFirst:
                message = firstWords[index];
                break;
            case MessageTypeWin:
                message = winWords[index];
                break;
            case MessageTypeLose:
                message = loseWords[index];
                break;
        }
        System.out.println(message);
//        System.out.println(index);//只做调试用，正式不需要
    }

    //人类玩家有哪些属性和方法呢
    //属性：名称、分数，所出的拳，（角色对应的音效和台词）
    private String name;
    private int score;
    private int first;

    /*
     * 角色在出拳的时候，所说的个性台词
     * */
    private String[] firstWords = {
            "我渴望有价值的对手",
            "他们不敢还击",
            "别人也尝试过，但只有我成功",
            "这也算得上是挑战吗?",
            "天赋、荣誉、信念，还有美图!"
    };

    private String[] winWords = {
            "像英雄一样战斗，或者像懦夫一样死去。",
            "即使是一无所有的人也会为自己所珍惜的一切而献出生命。",
            "心怀恐惧的死去" +  name + "或者手染鲜血的获胜。",
            "疼痛只是暂时的，而胜利是永远的。",
            "你输了，别狡辩"
    };

    private String[] loseWords = {
            "嘿，我知道一个能让我走路的时候不被绷带绊倒的办法，你们想听吗？",
            "我还以为你从来都不会选我呢……",
            "我日复一日地把自己弄得伤痕累累，只是为了看到你为我查看伤口时的柔情",
            "真可怜，让我抱抱你……",
            "下路一直叫我去，别人在我野区，我怎么去嘛"
    };
    //方法：
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getFirst(){
        first = (int)(Math.random()*3) + 1;
       // first = ((int)(Math.random()*30000))%3 + 1; 不知道为什么他每次都这么写
        return first;
    }

//    public void setFirst(int first){
//        this.first = first;
//    }


}
