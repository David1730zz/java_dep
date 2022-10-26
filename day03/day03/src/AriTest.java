/*
运算符之一：算数运算符
+ - * / ++ -- --
 */



class AriTest {
    public static void main(String[] args) {
        //除号
        int num1 =12;
        int num2 = 5;
        int result1 = num1 / num2; //2
        System.out.println(result1);
        int result2 = num1 / num2 * num2;
        System.out.println("jieguoshi:" + result2); // 10

        double result3 = num1 / num2;
        System.out.println("双浮点是：" + result3);


        double numzdw = 7;
        double numzdw1 = 4;
        double resultzdw = numzdw / numzdw1;
        System.out.println("张大为结果是：" + resultzdw);
        double result4 = num1 / num2 + 0.0;
        double result5 = num1 / (num2 + 0.0);
        System.out.println("结果4是" + result4);
        System.out.println("结果5是" + result5);

        // %取余运算，计算除法的余数
        //余数有负数 计算多少即多少
        int num6 = 12;
        int num7 = 5;
        System.out.println("num6与num7的余数是：" + num6 % num7);

        int num8 = -12;
        int num9 = 5;
        System.out.println("num8与num9的余数是：" + num8 % num9);

        //（前++）先自增1，后运算
        int a1 = 10;
        int b1 = ++a1;
        System.out.println(a1);
        System.out.println(b1);
        //（后++）先运算，后自增1
        int a2 = 10;
        int b2 = a2++;
        System.out.println(a2);
        System.out.println(b2);
        int a3 = 10;
        ++a3;
        int b3 = a3;
        System.out.println("b3是：" + b3);

        //自增1不会改变本身变量的数据类型
        byte s1 = 127;
        s1++;
        System.out.println(s1);
        byte s2 = 127;
        //前--：先自减1，后运算
        //后--：先运算，后自减1
        int a4 = 55;
        int b4 = --a4;
        System.out.println(b4);

    }
}
