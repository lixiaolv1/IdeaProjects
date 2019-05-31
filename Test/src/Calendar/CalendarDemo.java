package Calendar;
/*
 * 演示日历的常用方法
 */



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

import static java.util.Calendar.YEAR;

public class CalendarDemo {
    public static void main(String[] args) throws ParseException {
        //Calendar是一个抽象类，一般由子类GregorianCalendar来实现
        Calendar cal = Calendar.getInstance();
        //System.out.println(cal.getClass());

        //使用日历打印打印当前时间
        int year = cal.get( YEAR );
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
        cal.set( 2019,5,18,14,28,4 );
        Date date = cal.getTime();
       System.out.println( date.toLocaleString());

        // 日期格式化类
        SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss:SSS" );
        String strDate = format.format( date );
        System.out.println(strDate);
        // format最重要的是将字符串转成Date类型
        Date newDate = format.parse( "2019-05-18 23:43:59:999" );
        System.out.println(newDate.toLocaleString());

        //Calendar cal1 = Calendar.getInstance();
        //因为Calendar是抽象类，只能获取一次实例化，所以无法比较两个日期的差距

        //子类就可以new实例化了
        //注意月份的时候，因为月份是从0开始，所以此处要真实8月，应该输入 8-1
        GregorianCalendar cal2 = new GregorianCalendar(2019,4  ,18 );
        long diff = Math.abs(cal.getTimeInMillis() - cal2.getTimeInMillis() );
        int diffDays = (int)(diff/1000/60/60/24);

        System.out.println(cal2.getTime().toLocaleString());


        System.out.println("相差" + diffDays + "天");

        cal.add( Calendar.YEAR ,3 );
        System.out.println(cal.get(Calendar.YEAR));

    }
}