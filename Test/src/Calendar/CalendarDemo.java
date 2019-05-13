package Calendar;
/*
 * 演示日历的常用方法
 */


import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        //Calendar是一个抽象类，一般由子类GregorianCalendar来实现
        Calendar cal = Calendar.getInstance();
        //System.out.println(cal.getClass());

        //使用日历打印打印当前时间
        int year = cal.get( Calendar.YEAR );
        int month = cal.get(Calendar.MONTH) + 1 ;
        int day = cal.get( Calendar.DATE );
        int hour = cal.get( Calendar.HOUR );
        int minute = cal.get( Calendar.MINUTE );
        int sencond = cal.get( Calendar.SECOND );
        int milliSencond = cal.get( Calendar.MILLISECOND );
        System.out.println("当前时间：");

        String strTime = String.format( "%d-%02d-%02d %d-%d-%d:%s" ,
                year, month, day, hour, minute, sencond, milliSencond
                );
        System.out.println(strTime);

    }

}
