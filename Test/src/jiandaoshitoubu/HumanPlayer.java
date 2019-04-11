package jiandaoshitoubu;

public class HumanPlayer {
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
             System.out.println(index);
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
                "动感光波~biu",
                "大象会跳舞",
                "我做事，和她不同，不需要指示",
                "规矩是阻碍，谁定的谁去守吧",
                "说教够多了，你拦不住我。"
        };

        private String[] winWords = {
            "还有谁",
             "猜拳，有点儿意思",
                "~~~超~~~~神~~~",
                "全军出击！",
                "你输了，别狡辩"
        };

        private String[] loseWords = {
          "通往成功的道路在施工",
          "潮水褪去，鱼儿才能上岸",
          "夏天就是不好，比春天热",
           "将来的事，将来再说",
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
            return first;
        }

        public void setFirst(int first){
            this.first = first;
        }
}
