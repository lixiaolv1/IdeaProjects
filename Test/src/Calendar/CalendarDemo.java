package Calendar;
/*
 * 演示日历的常用方法
 */



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;

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

        String strTime = String.format( "%d-%02d-%02d  %d:%d:%d_%s" ,
                year, month, day, hour, minute, sencond, milliSencond
                );
        System.out.println(strTime);

        //为日历对象设定时间
        cal.set( 2012,2,5,14,28,4 );
        Date date = cal.getTime();
        System.out.println( date.toLocaleString());

        // 日期格式化类
        SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss:SSS" );
        String strDate = format.format( date );
        System.out.println(strDate);


    }
}