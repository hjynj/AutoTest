package com.course.testng;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ShengTest {

    @Test
    public void testDance() {
        Sheng s1 = new Sheng();
        s1.dance();
    }
}