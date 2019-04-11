import java.util.Scanner;

public class CircleV3 {

    //圆的半径
    private double radius;
    //圆的周长
    private double perimeter;
    //圆的面积
    private double area;

    public double getRadius(){
        return radius;
    }

    public double getRadius(double radius){
        return radius;
    }

    public void setRadius(double radius) {
        //this->自指针 指向自己
        if (radius <= 0) {  //封装的好处，可以对传入的属性进行简单的验证
            radius = 1;
        } else {
            this.radius = radius;
        }
    }
    //获取半径
    public void inputRadius(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        this.radius = input.nextDouble();
        if (radius <= 0){
            System.out.println("请输入正确的半径！");
            inputRadius();
            return;  //如果用户的输入不合法，则停止，避免下面的getPermeter()和getArea()继续运行
        }
        getPermeter();
        getArea();
    }
    //获取圆的周长
    public void getPermeter(){
        this.perimeter = radius * Math.PI * 2;
        System.out.println("圆的周长为：" + perimeter);
    }

    //获取圆的面积
    public void getArea(){
        this.area = Math.PI * Math.pow(radius,2);
        System.out.println("圆的面积为：" + area);
    }
}

