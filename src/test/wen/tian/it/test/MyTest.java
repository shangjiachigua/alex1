package wen.tian.it.test;

import org.junit.Test;
import wen.tian.it.model.User;

public class MyTest {
    public MyTest(){
        System.out.println("woxiangrimanjingdebb");
    }
    @Test
    public void test1(){
        int i = 0;
        System.out.println(i++);
    }
    @Test
    public void test2(){
        User user = new User();
        user.setName("sss");
        System.out.println(user.getName());
    }
}
