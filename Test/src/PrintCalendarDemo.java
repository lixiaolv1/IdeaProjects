import java.util.Scanner;

public class PrintCalendarDemo {
    //用户输入的年份和月份
    public static int year = Integer.MIN_VALUE;
    public static int month = Integer.MIN_VALUE;
    //如果不希望别人引用的话，就用private
    private static int[] dayOfMonth = {31,28,31,30 ,31,30,31 ,31,30,31 ,31,30,31};

    public static void main (String[] args){
            PrintCalendar();
//            getSumDayOfYears();
    }
    /*
    打印月历的核心方法,在这个方法里面调用其他具体的方法
     */
    private static void PrintCalendar() {
        //1、让用户输入年份和月份
        InputYearAndMonth();
        //2、计算1900-1-1到用户输入年月份的总天数（year=2017，moth=7,2017-7-1)
            //2-1、计算各年的总天数
            //2-2、计算各月的总天数
        int sum = getSumDayOfYears();
        sum += getSumDayOfMonth();
        sum ++; //加一天才到下个月1号
        //3、先打印年份和月份（英文）
        //4、打印月份的标题（星期一到星期天）
        PrintMonthTitle();
        //5、根据某月1号是星期几，打印月历的内容
        PrintCalendarContent(sum % 7);
    }

    /*
    接收用户输入的年份和月份
     */
    private static void InputYearAndMonth(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要查看的年份：");
        year = input.nextInt();
        System.out.println("请输入你要查看的月份：");
        month = input.nextInt();
        //关闭这个对象，节省资源
        input.close();
        input = null;
    }

    //获得1900-year年的总天数
    //获得1900-year年的总天数
    private static int getSumDayOfYears(){
        //需要判断用户是否已经输入了年份
        if (year == Integer.MIN_VALUE){
            System.out.println("年份错误，请重新输入年份和月份");
            InputYearAndMonth();
        }
        int sum = 0;
        for (int i = 1990; i < year; i++) {
            sum += 365;
//            if (year % 4 == 0){
//                sum += 1;
//            }因为闰年稍后会用到，建议封装成方法
            if (isLeapYear(i)){
                sum ++;     //闰年多加一天
            }
        }
        return sum;
    }

    /*
     *得到year年1月1号到year年month-1月最后一天的总天数
     */
    private static int getSumDayOfMonth(){
        int sum = 0;
        for (int i = 0; i <month - 1 ; i++) {
            sum += dayOfMonth[i];
            //如果year是闰年，并且month>=3
        }
        if (isLeapYear(year) && month >=3 ){
            sum ++;
        }
        return sum;
    }

    /*
     *用来判断用户输入的年份是否是闰年
     * 此处之所以会重新定义一个year，因为这个是局部变量，和全局变量year有所区别
     */
    private static boolean isLeapYear(int year){
        return year % 400 == 0 || year %4 == 0 && year % 100 != 0;
    }

    /*
     *打印日历的表头
     *打印月份和星期
     */
    private static void PrintMonthTitle(){
        String[] monthNames = {"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
        System.out.println("\t\t" + year + "\t" + monthNames[month - 1]);
        String[] weekdays = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
        for (int i = 0; i <weekdays.length ; i++) {
            System.out.print(weekdays[i] + "\t");
        }
        System.out.println();
    }

    /*
     *打印当月的日期，换行和空格自己调整
     */
    private static void PrintCalendarContent(int dayOfWeek){
        //dayOfWeek的取值范围是0-6 ，
        int sepCount = 0;  //相当于\t的数量
        if (dayOfWeek == 0){
            sepCount = 6;
        }else {
            sepCount = dayOfWeek - 1;
        }
        for (int i = 0; i <dayOfWeek - 1 ; i++) {
            System.out.print("\t\t");
        }
        for (int i = 0; i < dayOfMonth [month - 1]; i++) {
            System.out.print(i + 1);
            if ((dayOfWeek + i) % 7 == 0){
                //周日打印换行
                System.out.println();
            }else {
                System.out.print("\t\t");
            }
        }
    }


}
