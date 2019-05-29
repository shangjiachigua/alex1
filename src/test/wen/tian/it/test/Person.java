package wen.tian.it.test;

/**
 * @author tianwenwen
 * @date 2019/5/26 23:43
 **/
public class Person {
    private int i = 9;
    protected int j;

    public Person() {
        System.out.println("i="+i+",j="+j);
    }
    private static int x1=
            printinit("static person x1 init");

   static int printinit(String s) {
        System.out.println(s);
        return 47;
    }
}
