public class test1
{
    public static void main(String[] args) {
        int a = 3;
        int[] b = {2,4,6,8,10};

        for (int i = 0; i < 5; i++) {

            if (b[i] == 2){
                a += i;
                System.out.println(a);
            }else if (b[i] == 4){
                a += i;
                System.out.println(a);
            }else {
                System.out.println(a);
            }

        }


    }


}
