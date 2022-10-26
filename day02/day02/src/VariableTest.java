/**
 * 变量都定义在作用域内 出了作用域则失效
 * 变量都定义在作用域内。在作用域内是有效的，出了作用域就会失效
 * 同一个作用域内不可以声明两个同名的变量名，即只能定义一个
 */


class VariableTest {
    public static void main(String[] args) {
        System.out.println("hello world!");
        int myAge = 12;
        System.out.println(myAge);

        int myNumber;
        myNumber = 10;
        System.out.println(myNumber);
        int myClass = 8;
        System.out.println(myClass);
    }


}
