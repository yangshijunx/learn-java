package day02;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String text = "hello world";
        String text2 = "hello world";
        text = text + "mmm";
        String text3 = new String("hello world");
        User bob = new User("bob", "test");
        // string类的hashCode方法
        System.out.println("text的HashCode：" + text.hashCode() + '\n');
        // string类的subString方法
        // 用于截取字符串
        System.out.println("text的2-4位：" + text.substring(2, 4) + '\n');
        // string类的indexOf方法
        System.out.println("text中查找z：" + text.indexOf('z', 3) + '\n');
        // 获取字符串的字节数组，可以指定编码格式
        System.out.println("text的utf编码：" + Arrays.toString(text.getBytes(StandardCharsets.UTF_8)));
        // 字符串的不可变性1.一般来说我们使用string对象保存的密码等用户信息肯定是不能随便修改的
        // 2.因为在哈希表中我们使用字符作为hash表的键值，如果经常变动的话，哈希表性能会变差
        System.out.println("创建用户的姓名" + bob.getUserName());
        // 相同的字符串java会从缓存池中获取
        System.out.println("三个text" + text + text2);
        System.out.println("第一个text的hash：" + text.hashCode());
        System.out.println("第二个text的hash：" + text2.hashCode());
        System.out.println("第三个text的hash：" + text3.hashCode());
        // 为什么上面这三个hash是相同的呢？
        // 使用 new 关键字创建一个字符串对象时，Java 虚拟机会先在字符串常量池中查找有没有‘hello world’这个字符串对象，
        // 如果有，就不会在字符串常量池中创建‘hello world’这个对象了，
        // 直接在堆中创建一个‘hello world’的字符串对象，然后将堆中这个‘二哥’的对象地址返回赋值给变量
        // 那他这里的引用问题是怎么处理的啊
        // intern方法
        String s1 = new String("你好啊");
        String s2 = s1.intern(); // 先从缓存池中查找，因为前面已经创建了，所以可以从缓存池中找到
        // 结果是false，这是因为s1指向的是堆中创建的“你好啊的地址”,
        // s2中保存的是缓存池中的值所以false
        System.out.println("你好啊是否相等:" + (s1 == s2));

        // 执行的时候首先在缓存池中创建对，不对，然后在做字符串拼接的时候java做了一步处理
        // 1.new String("对")，new String("不对") 在堆中创建
        // 2.new String("对") + new String("不对") 会创建一个StringBuilder 对象并将“对”“不对”加入其中
        // 这个新的字符串保存在堆上 相当于 new StringBuilder().append("二哥").append("三妹").toString();
        // 于是乎s3.intern()在缓存池中找不到，在堆中找到获取到的是堆中地址，所以true
        String s3 = new String("对") + new String("不对");
        String s4 = s3.intern();
        System.out.println("s3和s4是不是相等的？:" + (s3 == s4)); // 结果true
    }
}
class User {
    private final String name;
    private final String passWorld;
    public User(String name, String passWorld) {
        this.name = name;
        this.passWorld = passWorld;
    }
    public String getUserName() {
        return name;
    }
    public String getPassWorld() {
        return passWorld;
    }
}
