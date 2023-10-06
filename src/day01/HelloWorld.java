package day01;
public class HelloWorld {
    public static void main(String[] args){
        int num = 1;
        Dog dog = new Dog();
        dog.sing();
        System.out.println("hello world " + num);
    }
}

abstract class Animal {
    abstract void sing();
    public int num;
    public void run() {
        System.out.println("跑起来" + this.num);
    }
}
class Dog extends Animal {
    void sing() {
        System.out.println("dog的sing");
    }
}
