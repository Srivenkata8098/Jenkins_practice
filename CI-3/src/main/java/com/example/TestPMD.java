package com.example;

public class TestPMD {
    public void methodWithIssue() {
        int unused = 10; // PMD: UnusedLocalVariable
        System.out.println("This method has a PMD violation.");
    }
}

