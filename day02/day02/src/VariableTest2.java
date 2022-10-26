/**
 * 基本数据类型之间的运算规则
 *
 * 前提：这里讨论7种数据类型之间的变量运算 不包含Boolean类型
 *
 * 1. 自动类型提升
 *      当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型
 *      byte > short > int > long > float > double;
 *      *****规定！  byte、char、short之间互相运算时，最终结果都为int类型
 *      short和short之间做运算很容易超容量，所以定义为int；
 *
 * 2. 强制类型转换
 * 见variableTest3.java
 *
 * 说明：此时的容量大小指的是。表示数的范围大和小
 */

public class VariableTest2 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 12;
        //int b2 = b1 + i1;
        //long b2 = b1 + i1;
        float b2 =  b1 + i1;
        System.out.println(b2);
/**************************************/
        char c1 = 'a';//a代表97；
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);
        short s2 = 10;
        //short s3 = c1 + s2; 编译不通过
        // char c2 = c1 + s2;
        //char c3 = c1 + b2;
        //char c3 = c1 + b2;
        //System.out.println(t1);
    }
}
