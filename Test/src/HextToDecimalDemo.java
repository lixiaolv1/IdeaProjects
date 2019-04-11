import java.util.Scanner;

public class HextToDecimalDemo {
    /*
    十六进制和十进制之间的转换
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //1、让用户输入一个十进制数字
        System.out.println("请输入一个整数");
        int decNum = input.nextInt();
        //2、调用方法将十进制转换为十六进制

        System.out.println(DecToHex(decNum));

        //3、再将十六进制转回十进制
        System.out.println(HexToDec(DecToHex(decNum)));

    }

    /*
    将十六进制再转回十进制
     */
    public static int HexToDec(String hex){
        int decNum = 0;
        //6E如何转成十进制数呢，首选，E = 14; 等于 14 + 6*16 = 110
        //需要遍历十六进制字符串
        for (int i = 0; i < hex.length(); i++) {
            char tempChar = hex.charAt(i);
            if (tempChar >= '0' && tempChar <= '9'){
                 decNum += (tempChar - '0') * Math.pow(16,hex.length()-i-1);
            }else if (tempChar >= 'A' && tempChar <= 'F'){
                decNum += (tempChar - 'A' + 10) * Math.pow(16,hex.length()-i-1);
            }

        }

        return decNum;
    }


    /*
    将十进制转成十六进制
    十六进制以字符串形式输出
     */
    public static String DecToHex(int decNum){
       String hex = ""; //转换好的十六进制数
        while (decNum != 0){
            int temp = decNum % 16;  //取余数
            //余数有可能是0-9之间数字或者10-15之间的
            if (temp >= 0 && temp <= 9){
                hex = temp + hex;
            }else if (temp >= 10 && temp <= 15){
                //把数字转化为字符再拼接
                hex = (char)(temp % 10 + 'A') + hex;
            }
            decNum /= 16;
        }

       return hex;
    }

}
