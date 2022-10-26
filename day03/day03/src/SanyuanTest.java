/*
三元运算符，即三个变量
(条件表达式)? 表达式1 ：表达式2
2. 说明
        条件表达式的结果为boolean类型
        根据条件表达式真或假 决定执行表达式1还是表达式2
        如果表达式为false，则执行表达式2
3. 凡是可以使用三元运算符的地方，都可以使用if、else替代
三元运算符的运算比较简洁 运算效率高
4. 如果程序既可以使用三元运算符 又可以使用if-else结构，优先选择三元运算符

5. 运算符的优先级：想让谁先运算就加“（）”
 */

class SanyuanTest {
    public static void main(String[] args) {

        //获取两个整数的较大值
        int m =12;
        int n = 5;

        int max = (m>n) ?  m : n;
        System.out.println("max: " + max);

        //获取三个数的最大值
        int n1 = 12, n2 = 30, n3 = -43;

    }
}
