package com.mine.demo.helloworlddemo;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    public void testNextItem() throws Exception {
        int size = 3;
        int currentItem = 0;
        currentItem = (currentItem + 1) % size;
        int nextItem = (currentItem + 1) % size;
    }
}