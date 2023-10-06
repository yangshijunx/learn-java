package day02;

import day01.Penson;
// 引入所有类
// import day01.*

public class PackageMange {
    public static void main(String[] args) {
        // 同一个包内的类可以相互使用
        Animal bob = new Animal("cat", 11);
        // 调用子类方法的时候需要注意修饰符 public private protected
        System.out.println("使用当前包内的类：" + bob.getName());
        // 当然我们也可以使用其他的包内的对象
        // 第一种写出完整类名
//        day01.Penson tom = new Penson("tom", 18);
//        System.out.println("引入day01的类" + tom.getName());
        // 第二种import引入
        Penson tom = new Penson("tom", 19);
        System.out.println("全局引入day01的类" + tom.getName());
        //  果有两个class名称相同，例如，mr.jun.Arrays和java.util.Arrays，
        //  那么只能import其中一个，另一个必须写完整类名。
    }
}

