package wen.tian.it.test;

/**
 * @author tianwenwen
 * @date 2019/5/26 23:47
 **/
public class ManJing extends Person {
    private MyTest myTest = new MyTest();
    private int k1 = printinit("ManJingWoAiNia");

    public ManJing() {
        System.out.println("k1=" + k1);
        System.out.println("j=" + j);
    }
    private static int x2 = printinit("static Manjing x2 init");

    public static void main(String[] args){
        System.out.println("ManJing De bi");
        ManJing manJing = new ManJing();
    }
}
