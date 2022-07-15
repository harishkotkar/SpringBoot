//package com.harish.java;
//
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(ClassForJunit.class)
//class ClassForJunitTest {
//
//    @Test
//    void getNumberStatic() {
//        PowerMockito.mockStatic(ClassForJunit.class);
//
//
//        PowerMockito.when(ClassForJunit.getNumberStatic(5)).thenReturn(100);
//
//
//        int s1 = ClassForJunit.getNumberStatic(5);
//        Assert.assertEquals(100,s1);
//
//        int s2 = ClassForJunit.getNumberStatic(33);
//        Assert.assertEquals(100,s2);
//
//
//    }
//}