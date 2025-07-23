/*
package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from the CI-3 Java Project!");
    }
}
*/

package com.example;

public class TestPMD {
    public void methodWithIssue() {
        int unused = 10; // PMD: UnusedLocalVariable
        System.out.println("This method has a PMD violation.");
    }
}

