/*
分支结构中if-else结构，即条件判断结构

一、三种结构
1. if(条件表达式){
    执行表达式
    }
2. 二选一
    if(条件表达式){
    执行表达式
    }
    else{
    执行表达式
    }
3. 多选一
    if(条件表达式){
    执行表达式
    }
    else if(条件表达式){
    执行表达式
    }
    else if(条件表达式){
    执行表达式
    }
    ........
    else{
    执行表达式
    }
 */


public class IfTest {
    public static void main(String[] args) {
         //举例1
        int heartbeat = 79;
        if(heartbeat < 60 || heartbeat > 150){
            System.out.println("你活不长了");
        }
        System.out.println("检查结束");

        //举例2
        int age = 23;
        if(age < 18){
            System.out.println("你还可以看动画片");
        }else{
            System.out.println("你可以看成人电影了");
        }
        if(age <0 || age > 100){
            System.out.println("你输入的数据非法");
        }else if(age < 18){
            System.out.println("你是儿童");
        }else if(age < 35){
            System.out.println("你是青壮年");
        }else if(age < 60){
            System.out.println("你马上退休了");
        } else{
            System.out.println("尊老爱幼");
        }
    }
}
