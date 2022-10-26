/*
逻辑运算符使用
&逻辑与 &&短路与 |或 ||短路或 !非 ^异或
1.逻辑运算符操作boolean类型的变量
 */

public class LogicTest {

    //区分&和&& 与和短路与
    //相同点：&与&&运算结果相同
    // 当符号左边是ture时，二者都会执行符号右边运算
    // 当符号左边是false时 &继续执行符号右边运算。&&不会执行符号右边运算
    //开发中推荐使用短路与：&&
    public static void main(String[] args) {
        boolean b1 = true;
        b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("我现在在北京");
        }
        else {
            System.out.println("我现在在南京");
             }
        System.out.println("num1的值为：" + num1);
        boolean b2 = true;
        b2 = false;
        int num2 = 10;
        if (b2 && (num2++ > 0))
        {
            System.out.println("我现在在北京");
        }
        else {
            System.out.println("我现在在南京");
             }
        System.out.println("num2的值为：" + num2);

        /*
        区分：|和|| 或和短路或
            相同点1：|与||的运算结果相同
            相同点2： 当符号左边是false时，二者都会执符号右边运算
            当符号左边是ture时，|会执行符号右边运算，而||不执行符号右边运算
            开发中推荐使用短路或：||
         */
        boolean b3 = false;
        //b3 = false;
        int num3 = 10;
        if (b3 | (num3++ > 0))
        {
            System.out.println("我现在在北京");
        }
        else {
            System.out.println("我现在在南京");
        }
        boolean b4 = false;
        int num4 = 10;
        if (b4 || (num4++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }

        int i = 1;
        if(++i == 2)
        {
            System.out.println("chenggong");
        }
        //System.out.println("i是：" + i);
    }
}


