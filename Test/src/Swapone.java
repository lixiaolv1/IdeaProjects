
public class Swapone {
    public static void main(String[] args){
    int num1 = 5;
    int num2 = 100;
    swaps(num1,num2);
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
    }
    static void swaps(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

    }

}
