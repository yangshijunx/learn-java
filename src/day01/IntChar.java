package day01;
public class IntChar {
    public static void main (String[] args) {
        int int_value = 65;
        char char_value = (char) int_value;
        char char_value2 = Integer.toString(int_value).charAt(0);
        System.out.println("测试" + char_value2);
    }
}
