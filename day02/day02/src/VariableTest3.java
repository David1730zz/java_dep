/**
 *强制类型转换：自动类型提升
 * 1. 需要使用强转符：（）
 * 2. 注意点：强制类型转换可能导致精度损失
 */


class VariableTest3 {
    public static void main(String[] args) {
        double d1 = 12.3;
        //精度损失举例1
        int i1 = (int)d1; //(int)表示将double强转为int型
        System.out.println(i1);   //损失一位精度即0.3
        //没有精度损失
        long l1 =123;
        short s2 = (short) l1;
        System.out.println(s2);   //long强转为short精度，没有精度损失
        //精度损失举例2
        int i2 = 128;
        byte b = (byte)i2;
        System.out.println(b);   //int强转为byte 输出为-128 原因是二进制相关问题，也是一种精度损失

    }
}
