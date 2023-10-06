package day02;

public class StringContact {
    public static void main(String[] args){
        String text1 = "";
        StringBuilder text2 = new StringBuilder();
        long startTime=System.nanoTime();   //获取开始时间
        for (int i = 0; i < 10000; i++) {
            text1 += "?";
        }
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println("第一种程序运行时间： "+(endTime-startTime)/1000000+"ms");
        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            text2.append("?");
        }
        endTime = System.nanoTime();
        System.out.println("第二种程序运行时间： "+(endTime-startTime)/1000000+"ms");
        System.out.println("结果长度" + text1.length() + text2.length());
    }
}
