/*
赋值运算符
= += -= *= /= %=
 */

class SetValue {
    public static void main(String[] args) {
        //赋值符号 =
        int j1 = 10;
        int i2,j2;
        i2 = 12;
        j2 = 13;
        int i3 = 5,i4=6;
        /****************************/
        int num1 = 10;
        num1 += 2;//num1 = num1 + 2;
        System.out.println(num1);
        int num2 = 12;
        num2 %= 5;//num2 = num2 % 5
        System.out.println(num2);

        short s1 = 10;
        s1 += 2; // +=运算符不改变原有数据类型
        System.out.println(s1);

        //开发中如果希望变量实现+2的操作，有几种方法？
        //num = num + 2;   num += 2;
        //开发中，如果希望变量实现+1，有如下方式：
        //num = num + 1; num += 1; num++(推荐使用此方式);
    }
}
