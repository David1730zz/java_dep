public class luojilianxiti {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 42;
        if((z++ == 42) && (y = true));
        //z先判断是否为42，是42，随后z++ = 43 且y = ture
        // 即两方都为真 &&为真继续运行 即再z++ = 44；

        {
            z++;
        }
        System.out.println("z:" + z);
        if ((x = false) || (++z == 45)){
            // x = false ，++z = 44 + 1 =45
            // 短路或有真即真，运行下一步z++ = 46
            z++;
        }
        System.out.println("z的值是" + z);
        System.out.println("y:" + y);
        System.out.println("x:" + x);
        }
}
