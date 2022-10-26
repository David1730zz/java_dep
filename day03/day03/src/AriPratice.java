/**
 &#064;function  ：输出任意三位数的各位数字
 @author :zdw
 */

class AriPratice {
    public static void main(String[] args) {
        int num = 894;
        int baiwei = num / 100;
        int shiwei = num % 100 /10;
        int gewei = num % 10;
        System.out.println("百位为：" + baiwei);
        System.out.println("十位为：" + shiwei);
        System.out.println("个位为：" + gewei);
    }
}
