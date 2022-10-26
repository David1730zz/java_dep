/**
 *
 * 1. java定义的数据类型
 * （1）基本数据类型
 * 数值型： 整数型         byte（1字节），short（2字节），int（3字节），long（4字节）
 *          long型必须以l或L为结尾
 *    通常定义整型变量时使用int型
 *         浮点类型       float（4字节 最后需加f结尾），double（）
 *         java中有专门的类负责大数字的表示以及其他长度数据的表示
 * 字符型: char
 * 布尔型: boolean
 * （2）引用数据类型
 * 类:     class
 * 接口:   interface
 * 数组:   []
 *
 *
 * 2. 变量在程序中的位置
 * 成员变量 vs 局部变量
 */
class VariableTest1 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = -128;
      //  b2 = 34;
        System.out.println(b1);
        System.out.println(b2);
        // short s1 = 128;
        int i1 = 23;
        long l1 = 3414234246l;
        System.out.println(l1);
        // 浮点型 float double 带小数点的
        double d1 = 123.3;
        System.out.println(d1 + 1);
        //float的结尾要以小f或大F结尾
        //通常定义浮点型用double 其范围更大精度更大 不用写f
        float f1 = 12.3f;
        System.out.println(f1);

        //字符型：char（1字符 = 2字节 = 16bit）
        //定义char型变量，通常用一对单引号‘’ 内部只能写一个字符
        char c1 = 'a';
        char c2 = '你';
        char c3 = '我';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        char c5 = '\n';
        c5 = '\t';
        System.out.println("hello" + c5);
        System.out.println("world");
        char c6 = '\u0043';
        System.out.println(c6);

        //布尔型：boolean 表示真或假
        //只能取两个值
        //在条件判断 循环结构中使用
        boolean bb1 = true;
        System.out.println(bb1);
    }
}
