import java.util.Scanner;

public class WeekDay {
//    private static int dayOfWeek;

    public static void main(String[] args){
        System.out.print("请输入今天是星期几：");
        int dayOfWeek = new Scanner(System.in).nextInt();
        ShowWeekDayByChinese(dayOfWeek-1);
        ShowWeekDayByJapanese(dayOfWeek-1);
        ShowWeekDayByEnglish(dayOfWeek-1);
    }
    private static boolean isRight(int dayOfWeek){
//        WeekDayDemo.dayOfWeek = dayOfWeek;

        if (dayOfWeek < 1 || dayOfWeek > 7){
//            System.out.println("必须输入1-7之间的数字");
            return false;
        }
        return true;
    }
        /*
         *以中文的方式，打印星期几
         * @param dayOfWeek 1-7之间的整形数字，用来表示星期几
         */


        public static void ShowWeekDayByChinese(int dayOfWeek){
        if (!isRight(dayOfWeek)){
            System.out.println("请输入1-7之间的数字");
            return;
        }
            String[] weekdays = {"星期一","星期二","星期三","星期四","星期五","星期六","星期天"};
            System.out.println(weekdays[dayOfWeek]);
        }

        static void ShowWeekDayByJapanese(int dayOfWeek){
        if (!isRight(dayOfWeek)){
                System.out.println("请输入1-7之间的数字");
                return;
            }
            String[] weekdays = {"月曜日(げつようび)","火曜日(かようび)","水曜日(すいようび)","木曜日(もくようび)","金曜日(きんようび)","土曜日(どようび)","日曜日(にちようび)"};
            System.out.println(weekdays[dayOfWeek]);
        }

        static void ShowWeekDayByEnglish(int dayOfWeek){
        if (!isRight(dayOfWeek)){
                System.out.println("请输入1-7之间的数字");
                return;
            }
            String[] weekdays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            System.out.println(weekdays[dayOfWeek]);
        }

    }
