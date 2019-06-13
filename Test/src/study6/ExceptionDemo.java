package study6;



public class ExceptionDemo {
    public static int division(int num1,int num2){
        System.out.println("计算之前");
        int result = Integer.MIN_VALUE;

        try{
            result = num1/num2 ;
        }catch (Exception e){
            System.err.println( e.getMessage() );
            //日志记录
        }

        System.out.println("计算除法后");
        return result;
    }

    public static void main(String[] args) {
        int result = division( 18,0 );
        System.out.println("result=" + result);
    }

}
