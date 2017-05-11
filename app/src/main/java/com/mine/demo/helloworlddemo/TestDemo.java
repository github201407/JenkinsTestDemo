package com.mine.demo.helloworlddemo;

/**
 * @author chenmingqun
 * @date 2017/3/7
 */

public class TestDemo {
    private static int currentItem = 0;

    public static void main(String[] args) {
        testNextItem();
        testNextItem();
        testNextItem();
    }

    public static void testNextItem(){
        int size = 3;
        currentItem = (currentItem + 1) % size;
        int nextItem = (currentItem + 1) % size;
        System.out.println(currentItem + " " + nextItem);
    }
}
