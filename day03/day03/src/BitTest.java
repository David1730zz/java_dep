/*
位运算符（了解即可）
结论：
1. 位运算符操作的都是整型数据
2. << :在一定范围内，每左移1位相当于 ×2
   >> :在一定范围内，每右移1位相当于 ÷2
 */

public class BitTest {
    public static void main(String[] args) {
        /*
        int i = 21;

        //每次<< 左移相当于×2 即21 * 2 * 2 = 84
        //21 * 2 * 2 * 2 (3次×2)
        System.out.println("i << 2 :" + (i << 2));
        System.out.println("i << 3 :" + (i << 3));
        System.out.println("i << 27 :" + (i << 27));


        int m = 12;
        int n = 5;
        System.out.println("m & n: " + (m & n));
        System.out.println("m | n: " + (m | n));
        System.out.println("m ^ n: " + (m ^ n));
*/
        //练习:交换两个变量的值
        int num1 = 10;
        int num2 = 20;

        //方式1
       /* int temp1;
        temp1 = num2;
        num2 = num1;
        num1 = temp1;
        System.out.println("num1:" + num1 + "num2 : " + num2);
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        */

        //方式二
        /*
        num1 = num1 + num2;//30
        num2 = num1 - num2; //30-20=10
        num1 = num1 - num2;//30-10=20
        System.out.println("num1:" + num1 + "   num2 : " + num2);
        */
        //方式三：使用位运算符
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println(num1 + "    " + num2 + "     ");
    }
}
