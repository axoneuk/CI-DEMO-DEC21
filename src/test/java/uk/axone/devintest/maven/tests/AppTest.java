package uk.axone.devintest.maven.tests;

import org.junit.Assert;
import org.junit.Test;


public class AppTest {

    @Test
    public void test1(){
        System.out.println("Running test 1");
    }

    @Test
    public void test2(){
        System.out.println("Running test 1");
    }

    @Test
    public void test3(){
        System.out.println("Running test 1");
        Assert.fail();
    }

    @Test
    public void test4(){
        System.out.println("Running test 1");
    }

    @Test
    public void test5(){
        System.out.println("Running test 5");
    }

    @Test
    public void test6(){
        System.out.println("Running test 6");
        Assert.fail();
    }

    @Test
    public void test7(){
        System.out.println("Running test 7");
        Assert.fail();
    }

}
