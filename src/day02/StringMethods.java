package day02;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String text = "hello world";
        String text2 = "hello world";
        // String text3 = new String("hello world");
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
        System.out.println("第一个text的hash：" + text.hashCode());
        System.out.println("第二个text的hash：" + text2.hashCode());
        // System.out.println("第三个text的hash：" + text3.hashCode());
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
