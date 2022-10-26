/*
    String类型变量的使用
    1. String属于引用类型
    2.
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "hello world";
        System.out.println(s1);

        String s2 = "a";
        String s3 = "";
        System.out.println(s2);
        System.out.println(s3);
        /************************************/
        int number = 1001;
        String numberStr = "学号：";
        String info = numberStr + number; //+： 连接运算
        boolean b1 = true;
        String info1 = info + b1;
        System.out.println(info1);
        int test = 10;
        double result = test % 3;
        System.out.println("结果是：" + result);


    }
}
