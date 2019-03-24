package com.example.demo;

import com.example.demo.beans.OutputBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    void reallySimpleTest(){
        Assertions.assertTrue(true);
    }

    @Test
    void sillyTest(){
        OutputBean ob=new OutputBean("test",1);
        Assertions.assertEquals(ob.getKey(),"test");
    }
}
