package day01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args){
        int[] arr = {1,2,9,3};
        // 调用排序方法
        Arrays.sort(arr);
        Integer[] arr2 = {4,5,6};
        // Arrays.asList 的参数需要是 Integer 数组，而 anArray 目前是 int 类型，
        // 我们需要换另外一种方式。我这里直接修改了
        List<Integer> aList = new ArrayList<>();
        // 借助Arrays 类的 asList() 方法：
        List<Integer> aList2 = Arrays.asList(arr2);
        // 直接新增会报错是因为Arrays.asList 方法返回的 ArrayList 并不是 java.util.ArrayList，
        // 它其实是 Arrays 类的一个内部类
        // 我们需要对他进行处理
        aList2  = new ArrayList<>(aList2); // 不做这里的转换是不能调用add方法的，添加和删除都不行
        aList2.add(7);
        System.out.println("list" + aList);
        // 数组转list
        for (int num: arr) {
            aList.add(num);
        }
        System.out.println("操作之后list" + aList + '\n' + aList2);
    }
}
