package day02;

public class ClassContractor {
    private String name;
    private int age; // 似有属性有默认值
    private void sing() {
        System.out.println("我会唱歌" + age);
    }
    public static void main(String[] args) {
        ClassContractor bob = new ClassContractor();
        // 第一种初始化的方法
        bob.age = 12;
        bob.name = "bob";
        bob.sing();
    }
}
class Person {
    private String name;
    private int age;
    public void init(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Person bob = new Person();
        bob.init("bob", 18);
        System.out.println("结果" + bob.name);
    }
}

class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public static void main(String[] args) {
        Animal dog = new Animal("dog", 11);
        System.out.println("animal" + dog.name);
    }
}
