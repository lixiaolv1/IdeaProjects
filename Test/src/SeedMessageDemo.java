/*
    可选参数：喊话者，频道，喊话内容，喊话次数，喊话的时间间隔等
 */

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class SeedMessageDemo {
    public static void main(String[] args){
//      SendMessage("王二狗","世界","来个法师，4=1，来了就开",5,1);
//      SendMessage("张大娘");
        SendMessage("李白","副本");
    }

    /*
    重载的喊话方法，参数分别是 昵称 和 喊话频道
     */
    public static void SendMessage(String nickNum,String channalName){
        SendMessage(nickNum,channalName,"这个故事接下来",4,1);
    }

    /*
    重载的喊话方法，只需要用户提供昵称参数即可进行默认的喊话
     */
    public static void SendMessage(String nicNum){
        String[] contents = {
                "欢迎啊小友",
                "世界是你的",
                "下路没闪"
        };
        SendMessage(nicNum,"默认频道",contents[(int)(Math.random() * 5 )],10,1);
    }
    /*
        name            喊话者的昵称
        channelName      喊话频道
        message           喊话内容
        count           喊话次数
        interval        喊话的时间间隔
     */
    public static void SendMessage(String name,String channelName,String message,int count,int interval){
        //喊话的总体逻辑就是拼接一个字符串
//        if(interval < 5 ) interval = 5;
        String value = String.format("【%s】%s,%s",
                channelName,name,message
                );
        for (int i = 0; i < count; i++) {
            System.out.println(value);
            try {
//                Thread.sleep(interval*1000);//休眠多少秒
                TimeUnit.SECONDS.sleep(interval/10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
