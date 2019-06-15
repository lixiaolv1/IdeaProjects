package study6;
/*
 * 免检异常——父类就是RunTimeException/Error
 */


public class UnCheckedException {
    public static void main(String[] args) {
//        String value = null;
//        System.out.println(value.toString());
//        /*
//         * 空指针异常，java.lang.NullPointerException
//         * 在调用这个方法之前，这个对象一定是没有实例化的，没有空间，自然就是空指针
//         */
//
//        String stValue = "123a";
//        //字符串转换成数字
//        int value1 =Integer.parseInt(stValue);
//        System.out.println(value1);

        Object p = new Person();

        Student stu = (Student)p;
        /*
         * java.lang.ClassCastException: study6.Person cannot be cast to study6.Student
         * 类型转换出现异常，编译的时候出错误了，但是运行的时候就出异常了
         */



    }

}

class Person{

}
class Student extends Person{

}